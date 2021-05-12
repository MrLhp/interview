package com.interview.fighting.basic.generics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 关于List泛型学习
 */
public class GenericListStudy {
    public static void main(String[] args) {
        List<GenericModel> genericModels = new ArrayList<>();
        GenericModel model = new GenericModel();
        model.setName("1");
        genericModels.add(model);
        try {
            printUser(genericModels);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static <T> void printUser(List<T> model) throws IllegalAccessException, InstantiationException {
        Type type = model.getClass().getGenericSuperclass();
    }

}
