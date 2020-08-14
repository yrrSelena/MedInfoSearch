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
#用于用户记录表的创建
def create_tbl_user():
    conn = get_conn()
    cur = conn.cursor()
    sql_createTb = """CREATE TABLE IF NOT EXISTS user (
                          username VARCHAR(45) NOT NULL,
                          userpwd VARCHAR(45) NOT NULL,
                          email VARCHAR(45) NOT NULL
                          )ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;"""
    cur.execute(sql_createTb)
    cur.close()
    conn.close()  


def dataToMysql():
    #创建数据库
    #create_db()
    #创建表
    create_tbl_user()
    
if __name__ == '__main__':

    # datapath = "特征谱数据库/med/"
    # dataToMysql(datapath)
    dataToMysql()

    

