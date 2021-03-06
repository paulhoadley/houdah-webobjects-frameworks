/*
 * Modified MIT License
 * 
 * Copyright (c) 2006-2007 Houdah Software s.à r.l.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * Except as contained in this notice, the name(s) of the above copyright holders
 * shall not be used in advertising or otherwise to promote the sale, use or other 
 * dealings in this Software without prior written authorization.
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
**/

package com.houdah.web.control.controllers;

/**
 * Defines the interface of a delegate object to the SessionController that
 * serves for notifying the user of the sucess or failure of an operation.<br/>
 * 
 */
public interface MessageCentral
{
	// Public instance methods
	
	/**
	 * Notify the user of a successful completion of an operation.
	 * 
	 * @param confirmationMessage
	 *            the message to show to the user
	 */
	void dispatchConfirmationMessage(String confirmationMessage);
	
	
	
	/**
	 * Notify the user of a non fatal problem.
	 * 
	 * @param warningMessage
	 *            the message to show to the user
	 */
	void dispatchWarningMessage(String warningMessage);
	
	
	
	/**
	 * Notify the user of a failure to complete an operation or a fatal problem.
	 * 
	 * @param errorMessage
	 *            the message to show to the user
	 */
	void dispatchErrorMessage(String errorMessage);
}
