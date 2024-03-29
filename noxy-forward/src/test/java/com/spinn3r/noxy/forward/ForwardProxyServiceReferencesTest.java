package com.spinn3r.noxy.forward;

import com.google.inject.Injector;
import com.spinn3r.artemis.init.Initializer;
import com.spinn3r.artemis.init.advertisements.Caller;
import com.spinn3r.artemis.init.config.ResourceConfigLoader;
import com.spinn3r.noxy.forward.ForwardProxyServiceReferences;
import org.junit.Test;

import java.awt.Robot;

import static com.spinn3r.artemis.util.text.TextFormatter.wrap;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class ForwardProxyServiceReferencesTest {

    public static final String ROLE = "robot";

    @Test
    public void testBindings() throws Exception {

        Initializer initializer = new Initializer( ROLE, new ResourceConfigLoader() );

        initializer.replace( Caller.class, new Caller( Robot.class) );

        initializer.init( new ForwardProxyServiceReferences() );

        Injector injector = initializer.getInjector();

    }

}