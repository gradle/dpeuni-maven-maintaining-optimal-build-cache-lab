package com.example.application;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.StdIo;
import org.junitpioneer.jupiter.StdOut;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationStartupTest {

    @Test
    @StdIo
    public void checkConsoleOutput(StdOut out) throws IOException {
        // Call main
        Main.main(new String[]{});

        // expect System output
        assertEquals("Build Info:", out.capturedLines()[0]);
        assertTrue(out.capturedLines()[1].matches("buildTime=.*, version=.*"));
    }
}
