//package com.interview.study.basic.aspose;
//
//import org.apache.ibatis.javassist.*;
//
//import java.io.IOException;
//
//public class AsposeCrack {
//    //C:\Users\happy\Downloads
//    public static void main(String[] args) {
//        try {
//            ClassPool.getDefault().insertClassPath("C:\\Users\\happy\\Downloads\\aspose-slides-20.4-jdk16.jar");
//            CtClass ctClass = ClassPool.getDefault().getCtClass("com.aspose.slides.y6");
//            ctClass.getDeclaredMethod("if").setName("tempListIf");
//            ctClass.getDeclaredMethod("if").setBody("{return 1;}");
//            ctClass.getDeclaredMethod("tempListIf").setName("if");
//            ctClass.writeFile("d:\\test\\");
//        } catch (NotFoundException | CannotCompileException | IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
