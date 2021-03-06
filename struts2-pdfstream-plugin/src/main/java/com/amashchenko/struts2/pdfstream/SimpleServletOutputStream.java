/*
 * Copyright 2014-2016 Aleksandr Mashchenko.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amashchenko.struts2.pdfstream;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;

/**
 * Simple ServletOutputStream implementation.
 * 
 * @author Aleksandr Mashchenko
 * 
 */
public class SimpleServletOutputStream extends ServletOutputStream {

    private final OutputStream outputStream;

    public SimpleServletOutputStream(final OutputStream stream) {
        this.outputStream = stream;
    }

    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }
}
