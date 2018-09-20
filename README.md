# apitest
TestNg+allure+Jenkins 接口自动化框架

## 说明

> 本工程使用JAVA语言集合TestNG测试套件，可适用于Jenkins可持续集成测试！

> Jenkins 在构建时使用参数化构建方式，将String参数传递于Maven(pom.xml),在执行XX.xml测试套件时，将获取到的参数传于测试代码中！

> 测试报告目前仅使用ReportNg作为测试报告的输出格式！

### 运行环境

> Java ：建议1.8及以上                                  运行PC：win/Linux/Centos/..

### 注意

> 1.在添加测试用例时，首先考虑 参数的规划，全局可变参数 放至外部（使用参数化构建方式），模块可变参数放于 测试套件中的参数！

> 2.注意类与方式的继承性！    
![Screenshot](https://github.com/fxlysm/apitest/blob/master/image/000.png)
![Screenshot](https://github.com/fxlysm/apitest/blob/master/image/001.png)
![Screenshot](https://github.com/fxlysm/apitest/blob/master/image/002.png)
![Screenshot](https://github.com/fxlysm/apitest/blob/master/image/003.png)
