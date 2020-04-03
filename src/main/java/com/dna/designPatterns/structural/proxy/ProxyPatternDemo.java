package com.dna.designPatterns.structural.proxy;

/*
*
* Interface by wrapping
* Can add functionality
* Security, Simplicity, Remote, Cost
* Proxy called to access real object
* E.g. java.lang.reflect.Proxy, java.rmi.*
*
* ###   Design Considerations   ###
* Interface based
* Interface and implementation class
* java.lang.reflect.InvocationHandler
* java.lang.reflect.Proxy
* Client, Interface, InvocationHandler, Proxy, Implementation
*
*
* ###   Pitfalls    ###
* Only one proxy you can not create a chain
* Difficult to distinguish with other patters e.g. decorator or adapto
*
* */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        PostService postService
                = (PostService) SecurityProxy.newInstance(new PostServiceStub());

        System.out.println(postService.getTimeline("urwith_amol"));

        try {
            postService.postToTimeline("urwith_amol"
                    , "Some message that should't go through");
        } catch (Exception e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
