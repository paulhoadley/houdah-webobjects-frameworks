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

package com.houdah.web.view.table;

import com.houdah.appserver.components.Element;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.foundation.NSArray;

/**
 * A reusable component for displaying objects in a batched display group.
 */
public class HVCDisplayGroupTable extends Element
{
	// Private class constants
	
	private static final long	serialVersionUID	= 7657944951585980073L;
	
	
	
	// API
	
	/**
	 * Display group to display. API, Needs to be bound.
	 * 
	 * @TypeInfo WODisplayGroup
	 */
	private WODisplayGroup		displayGroup;
	
	
	
	/**
	 * Label of the 'previous' link. API, optional.
	 * 
	 * @TypeInfo String
	 */
	private String				previousActionLabel;
	
	
	
	/**
	 * Label of the 'next' link. API, optional.
	 * 
	 * @TypeInfo String
	 */
	private String				nextActionLabel;
	
	
	
	
	// Constructor
	
	/**
	 * Designated constructor
	 * 
	 * @param context
	 *            the context in which this component is instantiated
	 */
	public HVCDisplayGroupTable(WOContext context)
	{
		super(context);
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.webobjects.appserver.WOComponent#awake()
	 */
	public void awake()
	{
		super.awake();
		
		this.displayGroup = (WODisplayGroup) valueForBinding("displayGroup");
		
		this.previousActionLabel = (String) valueForBinding("previousActionLabel");
		
		if (this.previousActionLabel == null) {
			this.previousActionLabel = "previous";
		}
		
		this.nextActionLabel = (String) valueForBinding("nextActionLabel");
		
		if (this.nextActionLabel == null) {
			this.nextActionLabel = "next";
		}
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.webobjects.appserver.WOComponent#reset()
	 */
	public void reset()
	{
		this.displayGroup = null;
		this.previousActionLabel = null;
		this.nextActionLabel = null;
		
		super.reset();
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.webobjects.appserver.WOComponent#synchronizesVariablesWithBindings()
	 */
	public boolean synchronizesVariablesWithBindings()
	{
		return false;
	}
	
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.webobjects.appserver.WOComponent#isStateless()
	 */
	public boolean isStateless()
	{
		return true;
	}
	
	
	
	// Protected instance methods
	
	protected String previousActionLabel()
	{
		return this.previousActionLabel;
	}
	
	
	protected String nextActionLabel()
	{
		return this.nextActionLabel;
	}
	
	protected WODisplayGroup displayGroup()
	{
		return this.displayGroup;
	}
	
	
	protected NSArray displayedObjects()
	{
		return displayGroup().displayedObjects();
	}
	
	
	protected boolean needsBatchingControls()
	{
		return displayGroup().batchCount() > 1;
	}
}