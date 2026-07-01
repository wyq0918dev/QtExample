cmake_minimum_required(VERSION 3.16)

project(android_testApp VERSION 0.1 LANGUAGES CXX)

set(CMAKE_CXX_STANDARD_REQUIRED ON)

find_package(Qt6 REQUIRED COMPONENTS Quick)

qt_standard_project_setup(REQUIRES 6.11)

qt_add_executable(android_testApp
        main.cpp
)

qt_add_qml_module(android_testApp
        URI android_test
        QML_FILES Main.qml
)

target_link_libraries(android_testApp
        PRIVATE Qt6::Quick
)

install(TARGETS android_testApp
        BUNDLE DESTINATION .
        LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
)
