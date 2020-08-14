# MedInfoSearch
食品中致癌物信息检索网站



- medicineDemo主要是Java Web相关代码
- pythonCode中包含数据和数据库创建相关代码



## 一、开发环境
1) 数据库搭建：MySQL

2) 网站设计：采用IDEA编程，利用Maven管理项目，搭建SSM框架

## 二、数据导入
利用MyBatis逆向工程，自动生成相应的数据类文件、数据Example文件、Mapper文件。

## 三、页面设计
### 1.主页面(index.jsp)
1) 简易搜索
通过输入药品中文名称/中文别名/英文名称/英文别名/cas号等关键词，查找相关的药品

2) 复杂搜索
通过在表单各个框中输入相应的关键词，查找得到相关药品

### 2.相关搜索词条页面(medBriefInfo.jsp)
显示相关药品的简单信息

### 3.药品详细信息页面(medDetailInfo.jsp)
显示一种药品的详细信息
