package org.example.streamdemo;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TransactionDemo {

    private static  List<Transaction> sample = Transaction.sampleList();

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4();
        demo5();
        demo6();
        demo7();
        demo8();
        demo9();
    }

    /**
     * 找出2011年的所有交易并按交易额排序（从低到高）
     */
    public static void demo1(){
        List<Transaction> tr2011 = sample.stream()
                .filter(t->t.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println();
        tr2011.forEach(System.out::println);
    }

    /**
     * 交易员都在哪些不同的城市工作过
     */
    public static void demo2(){
        List<String> cities = sample.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println();
        cities.forEach(System.out::println);
    }

    /**
     * 查找所有来自剑桥的交易员,并按姓名排序
     */
    public static void demo3(){
        List<Trader> traders  = sample.stream()
                .map(Transaction::getTrader)
                .filter(t->t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println();
        traders.forEach(System.out::println);
    }

    /**
     * 返回所有交易员的姓名字符串，按字母顺序排序
     */
    public static void demo4(){
        String traderStr = sample.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .reduce("",(n1,n2)->n1+n2);
        System.out.println();
        System.out.println(traderStr);
    }

    /**
     * 有没有交易员是在米兰工作的
     */
    public static void demo5(){
        boolean isMilan = sample.stream()
                .map(t->t.getTrader().getCity())
                .anyMatch(s->s.equals("Milan"));
        System.out.println();
        if(isMilan){
            System.out.println("有交易员在米兰工作");
        }else{
            System.out.println("没有交易员在米兰工作");
        }
    }

    /**
     * 打印生活在剑桥的交易员的所有交易额
     */
    public static void demo6(){
        System.out.println();
        sample.stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    /**
     * 打印最高交易额
     */
    public static void demo7(){
        Optional<Integer> highestValue = sample.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        if(highestValue.isPresent()){
            System.out.println();
            System.out.println("最高交易额是：" + highestValue.get() + "元" );
        }
    }

    /**
     * 打印最低交易额
     */
    public static void demo8(){
        Optional<Integer> smallestValue = sample.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        if(smallestValue.isPresent()){
            System.out.println();
            System.out.println("最低交易额是：" + smallestValue.get() + "元" );
        }
    }

    /**
     * 原始类型特化流接口 减少装箱成本
     */
    public static void demo9(){
        int smallestValue = sample.stream()
                .mapToInt(Transaction::getValue)
                .sum();
        if(smallestValue!=0){
            System.out.println();
            System.out.println("最低交易额是：" + smallestValue + "元" );
        }
    }
}
