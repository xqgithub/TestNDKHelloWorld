#include "com_first_testndkhelloworld_HelloJni.h"


JNIEXPORT jint JNICALL
Java_com_first_testndkhelloworld_HelloJni_sayHello(JNIEnv *env, jobject instance, jint a) {
    int b = 1;
    a = a + b;
    return a - b;
}