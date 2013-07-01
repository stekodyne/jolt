/*
 * Copyright 2013 Bazaarvoice, Inc.

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bazaarvoice.jolt.exception;

/**
 * Exception thrown by JOLT transforms.  Should only be thrown from methods processing data.
 */
public class TransformException extends JoltException {

    public TransformException( String msg ) {
        super(msg);
    }

    public TransformException( String msg, Exception ex ) {
        super(msg, ex);
    }
}
