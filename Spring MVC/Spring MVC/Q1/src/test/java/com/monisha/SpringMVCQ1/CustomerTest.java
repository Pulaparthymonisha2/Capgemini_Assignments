package com.monisha.SpringMVCQ1;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

class CustomerTest {



    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer customer = (Customer) context.getBean("customer");

        System.out.println(customer);
    }

    @Test
    public void getCustomerId(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer customer = (Customer) context.getBean("customer");

        assertEquals(1,customer.getCustomerId());
    }

}