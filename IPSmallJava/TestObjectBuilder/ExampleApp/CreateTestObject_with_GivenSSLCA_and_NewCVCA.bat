@echo off
java -cp ../../IPSmallJava.jar com.secunet.ipsmall.tobuilder.TestObjectBuilder -xin "ICS_v0_1_3.xml" -template "TestObject_Template" -sslca "SSLCA" -testbed "../.." -default
pause
