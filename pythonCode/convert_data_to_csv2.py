# -*- coding: utf-8 -*-
#将excel数据转化为csv格式convert_data_to_csv.py
import os
import re
import pandas as pd
import numpy as np
import pymysql
def load_raw_data():
    # 进入特定路径
    os.chdir('F:\study\week1_medicine')
    # 读入excel数据
    data = pd.read_excel('药品基本信息库.xlsx')
    # df = pd.read_csv("x.csv")
    return data
def split_data(raw_data,col_name,col_cn_name):
    #print(col_cn_name)
    new_data = pd.DataFrame(raw_data,columns=[u"序号",col_cn_name])
    # 去除空值
    new_data = new_data.dropna(axis=0,how='any')
    # 生成空的pd表
    df_new_data = pd.DataFrame(columns=[col_name+'Id',col_name,'medId'])
    lens = len(new_data)
    cnt=0
    for i in range(lens):
        st = new_data.iloc[i][col_cn_name]
        #print(st)
        #re正则表达式，多分隔符
        list_str = re.split(r'[；;，、]',st)
        #print(list_str)
        for s in list_str:
            if s!="":
                df_new_data.loc[cnt]=[cnt+1,s,new_data.iloc[i][u"序号"]]
                cnt=cnt+1
    #print(df_new_data)
    return df_new_data
#print(df_cnAlias)
def write_to_csv(data,name,ind=False):
    # 保存至csv文件，注意中文字符
    data.to_csv("med/"+name+".csv",index=ind,encoding='utf_8_sig')
def get_med_data(raw_data):
    df_new_data = pd.DataFrame(raw_data,columns=[u"序号",u"中文名称",u"时间",u"cas号",u"ec号",u"分子量",u"熔点min",u"熔点max",u"沸点min",u"沸点max",
                                                 u"iarc等级",u"简介",u"外观",u"溶解性",u"毒性",u"限量要求",u"临床特性",u"代谢途径",u"代谢产物",u"涉及食品"])
    return df_new_data
def get_testMethods(raw_data):
    df_new_data = pd.DataFrame(columns=["methodId", "method","medId"])
    lens = len(raw_data)
    cnt = 0
    for i in range(lens):
        for j in range(10):
            st=raw_data.iloc[i][u"检测方法"+str(j+1)]
            if not pd.isnull(st):
                df_new_data.loc[cnt] = [cnt+1, st,raw_data.iloc[i][u"序号"]]
                cnt=cnt+1
    return df_new_data
def transferData(data):
    #得到中文别名数据表
    df_cnAlias = split_data(data,"cnAlias",u"中文别名")
    print(df_cnAlias)
    write_to_csv(df_cnAlias,"cnAlias")
    #得到英文名称数据表
    df_enNames = split_data(data,"enName",u"英文名称")
    write_to_csv(df_enNames,"enNames")
    #得到英文别名数据表
    df_enAlias = split_data(data,"enAlias",u"英文别名")
    write_to_csv(df_enAlias,"enAlias")
    #得到分子式数据表
    df_formula = split_data(data,"formula",u"分子式")
    write_to_csv(df_formula,"formula")
    #得到检测方法
    df_testMethods = get_testMethods(data)
    write_to_csv(df_testMethods,"testMethods")
    #得到药品信息表
    df_med = get_med_data(data)
    write_to_csv(df_med,"med")
if __name__ == '__main__':
    # 进入特定路径
    #os.chdir('F:\study\week1_medicine')
    # 读入excel数据
    # data = pd.read_excel('特征谱数据库/基本信息库-20190923.xls')
    # transferData(data)
    d="特征谱数据库"
    floderNames=("表面增强拉曼光谱法","气相色谱质谱法","液相色谱法","液相色谱质谱法")
    for i in range(len(floderNames)):
        dir = d + "/" + floderNames[i]
        dirlist = os.listdir(dir)
        for j in dirlist:
            if os.path.isfile(dir+"/"+j):
                data = pd.read_excel(dir+"/"+j)
                if i==0:
                    df_new_data = data.loc[:,[u"序号", u"特征峰1(cm-1）", u"特征峰2(cm-1）", u"特征峰3(cm-1）", u"特征峰4(cm-1）", u"特征峰5(cm-1）", u"特征峰66(cm-1）",
                                                        u"特征峰7(cm-1）", u"特征峰8(cm-1）", u"检出限",
                                                        u"特征图谱", u"参考文献", u"样品", u"其他测定分子"]]
                    df_new_data.index += 1
                    write_to_csv(df_new_data, floderNames[i])
                elif i==1:
                    df_new_data = data.iloc[:,[0]+[i for i in range(4,20)]]
                    df_new_data.index+=1
                    write_to_csv(df_new_data, floderNames[i])
                elif i==2:
                    df_new_data = data.iloc[:, [0]+[i for i in range(4,18)]]
                    df_new_data.index += 1
                    write_to_csv(df_new_data, floderNames[i])
                elif i==3:
                    df_new_data = data.iloc[:, [0]+[i for i in range(4,24)]]
                    df_new_data.index += 1
                    write_to_csv(df_new_data, floderNames[i])
                print(data)



    


##将数据写入mysql的数据库，但需要先通过sqlalchemy.create_engine建立连接,且字符编码设置为utf8，否则有些latin字符不能处理
#yconnect = create_engine('mysql+mysqldb://root:111111@localhost:3306/medicine?charset=utf8')
#pd.io.sql.to_sql(df_cnAlias,'tablename', yconnect, schema='medicine', if_exists='append')

