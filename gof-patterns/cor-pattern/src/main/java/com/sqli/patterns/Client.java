package com.sqli.patterns;

/**
 * Created by eric.manuguerra on 28.08.2014.
 */
public class Client {

    Handler handler;

    public void postRequest(Request request)
    {
        handler.handle(request);
    }

}
