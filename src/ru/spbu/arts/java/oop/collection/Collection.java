package ru.spbu.arts.java.oop.collection;
import java.util.List;
import java.util.ArrayList;

public class Collection {

    public static List<Integer> count(int n){
        List<Integer> a = new ArrayList<>();
        int k = 0;
        for (int i=0; i<n; i++){
            k = k+1;
            a.add(k);
        }
        return a;
    }

    public static void printList(List<String> a) {
        System.out.println("Элементов в списке: " + a.size());
        for (String number: a) {
            System.out.println(number);
        }
    }


    public static void printListWithIndices(List<String> a){
        System.out.println("Элементов в списке: " + a.size());
        int index = 0;
        for (String number: a) {
            index = index +1;
            System.out.println(index + ": " + number);
        }
    }

    public static List<String> concatenateLists(List<String> a, List<String> b){
        List<String> list = new ArrayList<>();
        for (String chislo: a) {
            list.add(chislo);
        }
        for (String chislo: b) {
            list.add(chislo);
        }
        return list;
    }

    public static List<String> reverseList(List<String> a){
        List<String> list = new ArrayList<>();
        for (int i = a.size()-1; i>=0; i--) {
            list.add(a.get(i));
        }
        return list;
    }

    public static void reverseListInPlace(List<String> a){
        List<String> list = new ArrayList<>();
        for (int i = a.size()-1; i>=0; i--) {
            list.add(a.get(i));
        }
        for (int i =0; i<a.size(); i++) {
            a.set(i, list.get(i));
        }
        return;
    }

    public static List<Integer> filterEvenIndices(List<Integer> a){
        List<Integer> list = new ArrayList<>();
        for (int i =1; i<a.size(); i = i+2) {
            list.add(a.get(i));
        }
        return list;
    }

    public static List<Integer> filterEven(List<Integer> a){
        List<Integer> list = new ArrayList<>();
        for (int i =0; i<a.size(); i++) {
            if (a.get(i) % 2 != 0){
                list.add(a.get(i));
            }
        }
        return list;
    }



    public static void main(String[] args) {
        List<Integer> a = count(5);
        List<String> list1 = List.of("abc", "xyz", "ooo");
        List<String> list3 = List.of("aaa", "bbb", "ccc");
        List<String> list4 = List.of("xxx", "yyy", "zzz");
        List<String> list5 = new ArrayList<>(List.of("first", "middle", "last"));
        List<Integer> ints = List.of(11, 22, 33, 55, 66, 88, 100, 3, 4);
        System.out.println(a);
        printList(list1);
        printListWithIndices(list1);
        List<String> list3plusList4 = concatenateLists(list3, list4);
        System.out.println(list3plusList4);
        List<String> list5rev = reverseList(list5);
        System.out.println("list5rev = " + list5rev + ", but list5 = " + list5);
        reverseListInPlace(list5);
        System.out.println("list5 = " + list5);
        System.out.println("ints = " + ints);
        System.out.println("ints no even indices = " + filterEvenIndices(ints));
        System.out.println("ints without even = " + filterEven(ints)); //["11", "33", "55", "3"]

    }
    }

