package com.spinn3r.noxy.forward;

import com.spinn3r.artemis.init.Initializer;
import com.spinn3r.artemis.init.advertisements.Caller;

/**
 *
 */
public class Main {

    public static final String PRODUCT = "noxy";
    public static final String ROLE = "forward";

    public static void main(String[] args) {

        try {

            Initializer initializer = new Initializer( PRODUCT, ROLE );

            initializer.replace( Caller.class, new Caller( Main.class) );
            initializer.launch( new ForwardProxyServiceReferences() );

            Thread.sleep( Long.MAX_VALUE );

        } catch (Exception e) {
            e.printStackTrace();
            System.exit( 1 );
        }

    }

}
