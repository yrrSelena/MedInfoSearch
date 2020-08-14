#数据录入可视化文件visualize.py
import os
import re
import numpy as np
import pandas as pd
from PyQt5 import QtCore, QtGui, QtWidgets
from PyQt5.QtWidgets import *
from PyQt5.QtCore import *
#import user package
import convert_data_to_csv
import convert_csv_to_sql
class Ui_MainWindow(QtWidgets.QMainWindow):
    def __init__(self):
        super(Ui_MainWindow,self).__init__()
        self.setupUi(self)
        self.retranslateUi(self)
    def setupUi(self, MainWindow):
        MainWindow.setObjectName("MainWindow")
        MainWindow.resize(500, 300)
        self.centralWidget = QtWidgets.QWidget(MainWindow)
        self.centralWidget.setObjectName("centralWidget")
        self.retranslateUi(MainWindow)
        #"打开文件"按钮
        self.btn1 = QtWidgets.QPushButton(self.centralWidget)
        self.btn1.setGeometry(QtCore.QRect(380, 100, 100, 40))
        self.btn1.setObjectName("btn1")
        self.btn1.setText("打开文件")
        MainWindow.setCentralWidget(self.centralWidget)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)
        self.btn1.clicked.connect(self.openFile)
        #"导入数据库"按钮        
        self.btn2 =  QtWidgets.QPushButton(self.centralWidget)
        self.btn2.setGeometry(QtCore.QRect(200, 230, 100, 40))
        self.btn2.setObjectName("btn2")
        self.btn2.setText("导入数据库")
        self.btn2.setEnabled(False)
        MainWindow.setCentralWidget(self.centralWidget)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)
        self.btn2.clicked.connect(self.loadData)
        #显示数据载入文件路径
        self.txt1 = QtWidgets.QLineEdit(self.centralWidget)
        self.txt1.setObjectName("txt1")
        self.txt1.setGeometry(QtCore.QRect(60, 100, 300, 40))
        self.txt1.setText(" ")
        MainWindow.setCentralWidget(self.centralWidget)
        QtCore.QMetaObject.connectSlotsByName(MainWindow)
    def retranslateUi(self, MainWindow):
        _translate = QtCore.QCoreApplication.translate
        MainWindow.setWindowTitle(_translate("MainWindow", "食品致癌物数据导入"))
    #打开文件路径
    def openFile(self):
        abs_path, _ = QFileDialog.getOpenFileName(self,'选择文件','','Excel files(*.xlsx , *.xls)')
        print(abs_path)
        self.txt1.setText(abs_path)
        self.btn2.setEnabled(True)
    #将Excel数据载入Mysql数据库
    def loadData(self):
        abs_path = self.txt1.text();
        filepath, filename = os.path.split(abs_path)
        os.chdir(filepath)
        data = pd.read_excel(filename)
        #print(filepath)
        #print(filename)
        self.btn2.setEnabled(False)
        datapath = filepath+'/med'
        if os.path.exists(datapath)==False:
            os.mkdir(datapath)
        #将excel数据转化为csv数据，并将食品致癌物数据表拆分为若干表
        convert_data_to_csv.transferData(data)
        print("excel->csv格式转化完成")
        #将csv数据导入mysql数据库
        convert_csv_to_sql.dataToMysql(datapath)
        print("数据录入Mysql数据库完成")    
#数据录入主函数
if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    MainWindow = QtWidgets.QMainWindow()
    ui = Ui_MainWindow()
    ui.setupUi(MainWindow)
    MainWindow.show()
    sys.exit(app.exec_())
