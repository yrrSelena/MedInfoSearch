# -*- coding: utf-8 -*-
#将csv格式数据录入数据库 convert_csv_to_sql.py
import os
import pymysql
import csv
import codecs
#连接数据库
def get_conn():
    conn = pymysql.connect(host='localhost', 
                           port=3306, 
                           user='root', 
                           passwd='111111',
                           db='medicine'
                           )
    return conn
#创建数据库
def create_db():
    conn = pymysql.connect(host='localhost', 
                           port=3306, 
                           user='root', 
                           passwd='111111'
                           )
    cur = conn.cursor()
    cur.execute("CREATE DATABASE IF NOT EXISTS medicine DEFAULT CHARACTER SET utf8")
#用于历史检索记录表的创建
def create_tbl_history():
    conn = get_conn()
    cur = conn.cursor()
    sql_createTb = """CREATE TABLE IF NOT EXISTS history (
                          hisId INT PRIMARY KEY AUTO_INCREMENT,
                          content VARCHAR(45) NULL,
                          create_time DATETIME NULL
                          )ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;"""
    cur.execute(sql_createTb)
    cur.close()
    conn.close()
#用于cnAlias,enNames,enAlias,formula等表的创建
def create_tbl(tbl_name,col_name):
    conn = get_conn()
    cur = conn.cursor()
    sql_createTb = """CREATE TABLE IF NOT EXISTS """+ tbl_name + """ ("""+ col_name +"""Id int(11) NOT NULL AUTO_INCREMENT,"""+col_name +""" varchar(50) COLLATE utf8_bin NOT NULL,
              medId int(11) NOT NULL,
              PRIMARY KEY (""" +col_name+"""Id),
              KEY """+col_name+"""_mid_idx (medId),
              index """+col_name+"""_idx ("""+col_name+"""),
              CONSTRAINT """+col_name+"""_mid FOREIGN KEY (medId) REFERENCES med (medId) ON DELETE NO ACTION ON UPDATE NO ACTION
              ) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
              """
    cur.execute(sql_createTb)
    cur.close()
    conn.close()     
#用于med表的创建
def create_med_tbl():
    conn = get_conn()
    cur = conn.cursor()
    sql_createTb = """CREATE TABLE IF NOT EXISTS med (
                          medId int(11) NOT NULL,
                          cnName varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          casNum varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          ecNum varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          molWt varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          
                          mpmin varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          mpmax varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          bpmin varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          bpmax varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          iarc varchar(20) COLLATE utf8_bin DEFAULT NULL,
                          
                          introduction varchar(1000) COLLATE utf8_bin DEFAULT NULL,
                          appearance varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          solubility varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          toxicity varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          clinicalCharacter varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          
                          metabolicPathway varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          food varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          testMethod varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          limitRequirement varchar(500) COLLATE utf8_bin DEFAULT NULL,
                          PRIMARY KEY (medId),
                          index cnName_idx (cnName),
                          index casNum_idx (casNum),
                          index ecNum_idx (ecNum)
                        ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
                    """
    cur.execute(sql_createTb)
    cur.close()
    conn.close()
def insert(cur, sql, args):
    cur.execute(sql, args)
#用于cnAlias,enNames,enAlias,formula等表的数据读取
def read_csv_to_mysql(filename,tbl_name):
    with codecs.open(filename=filename, mode='r', encoding='utf-8') as f:
        reader = csv.reader(f)
        head = next(reader)
        conn = get_conn()
        cur = conn.cursor()
        sql = 'insert into '+ tbl_name +' values(%s,%s,%s)'
        for item in reader:
            if item[1] is None or item[1] == '':  # item[1]作为唯一键，不能为null
                continue
            args = tuple(item)
            #print(args)
            insert(cur, sql=sql, args=args)
        conn.commit()
        cur.close()
        conn.close()
#用于med表的数据读取
def read_med_csv_to_mysql(filename):
    with codecs.open(filename=filename, mode='r', encoding='utf-8') as f:
        reader = csv.reader(f)
        head = next(reader)
        conn = get_conn()
        cur = conn.cursor()
        sql = 'insert into med values(%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s)'
        for item in reader:
            if item[1] is None or item[1] == '':  # item[1]作为唯一键，不能为null
                continue
            args = tuple(item)
            insert(cur, sql=sql, args=args)
        conn.commit()
        cur.close()
        conn.close()
def dataToMysql(datapath):
    os.chdir(datapath)
    #创建数据库
    create_db()
    #创建表
    create_med_tbl()
    create_tbl("CNAlias","cnAlias")
    create_tbl("ENNames","enNames")
    create_tbl("ENAlias","enAlias") 
    create_tbl("Formula","formula")
    create_tbl_history()
    #读取csv数据到sql
    read_med_csv_to_mysql('med.csv')
    read_csv_to_mysql('cnAlias.csv',"CNAlias")
    read_csv_to_mysql('enNames.csv',"ENNames")
    read_csv_to_mysql('enAlias.csv',"ENAlias")
    read_csv_to_mysql('formula.csv',"Formula")
    
if __name__ == '__main__':

    datapath = "med/"
    dataToMysql(datapath)
    

