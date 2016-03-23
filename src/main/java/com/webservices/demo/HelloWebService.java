package com.webservices.demo;
 
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
 
@WebService(
    name = "HelloWebService",
    portName = "HelloWebServicePort", 
    serviceName = "HelloWebServiceService", 
    targetNamespace = "http://demo.webservices.com/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class HelloWebService {
 
 
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name="guestname") String guestname){
 
        if(guestname==null){
            return "Hello";
        }
        return "Hello "+ guestname;
 
    }
}