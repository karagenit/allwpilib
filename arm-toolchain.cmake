cmake_minimum_required(VERSION 2.8)
INCLUDE(CMakeForceCompiler)
set(ARM_PREFIX arm-linux-gnueabi)
set(CMAKE_SYSTEM_NAME Linux)
CMAKE_FORCE_CXX_COMPILER(${ARM_PREFIX}-g++ GNU)
set(CMAKE_CXX_FLAGS "-march=armv7-a -mcpu=cortex-a9 -mfloat-abi=softfp -Wall" CACHE STRING "" FORCE)
set(CMAKE_CXX_FLAGS_DEBUG "-O0 -g3" CACHE STRING "" FORCE)
set(CMAKE_CXX_FLAGS_RELEASE "-O3 -g" CACHE STRING "" FORCE) # still want debugging for release?
SET(CMAKE_FIND_ROOT_PATH /home/patrick/wpilib/toolchains/arm-none-linux-gnueabi-4.4.1/arm-none-linux-gnueabi/libc)