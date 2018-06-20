LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE :=hello
LOCAL_SRC_FILES =: com_first_testndkhelloworld_HelloJni.c
include $(BUILD_SHARED_LIBRARY)