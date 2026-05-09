package com.lab.files;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PathResolverTest {

    @Test
    void joinUsesPlatformSeparator() {
        assertTrue(PathResolver.join("data", "report.txt").equals("data/report.txt"));
    }
}
