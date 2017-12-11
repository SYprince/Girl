package com.wangzi.girl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: prince
 * @Date: Created in 11:22 2017/11/27
 */
interface   nuclass<R>{
    public R s();
}
class c{
    private void c(){
        
    }
    private void g(){
        System.out.println("ggggggggggg");
    };
}
public class MyTest extends c{

    @Test
    public void contextLoads() throws Exception {
        c c = new c(){
            private void g(){
                System.out.println("test");
            }
        };
        c.g;
    }

    /**
     * 匿名内部类（lamda）
     * @param args
     */
    public static void main(String[] args){
        nuclass<String> nuc;
        nuc = "hello" :: toUpperCase;
    }
}
