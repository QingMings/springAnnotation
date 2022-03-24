cmake_minimum_required(VERSION 3.16.3)

project(helloJNA)
 message(输出目录 ${PROJECT_SOURCE_DIR})
SET(EXECUTABLE_OUTPUT_PATH ${PROJECT_SOURCE_DIR}/src/main/resources/) #设置可执行文件的输出目录
SET(LIBRARY_OUTPUT_PATH ${PROJECT_SOURCE_DIR}/src/main/resources/) #设置库文件的输出目录
add_library(helloJNA SHARED src/main/cpp/main.cpp)