/*******************************************************************************
 * Copyright (c) 2013, Regents of the University of California
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice, this list of conditions
 * and the following disclaimer.
 * 
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 * and the following disclaimer in the documentation and/or other materials provided with the
 * distribution.
 * 
 * None of the name of the Regents of the University of California, or the names of its
 * contributors may be used to endorse or promote products derived from this software without specific
 * prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 ******************************************************************************/
package calico.inputhandlers.groups;

import calico.*;

import calico.components.*;
import calico.components.menus.*;
import calico.components.piemenu.*;
import calico.controllers.CStrokeController;
import calico.controllers.CGroupController;
import calico.iconsets.CalicoIconManager;
import calico.inputhandlers.CGroupInputHandler;
import calico.inputhandlers.CalicoAbstractInputHandler;
import calico.inputhandlers.CalicoInputManager;
import calico.inputhandlers.InputEventInfo;
import calico.networking.*;
import calico.networking.netstuff.*;


import java.awt.geom.*;
import java.awt.*;

import java.util.*;

import org.apache.log4j.*;

import edu.umd.cs.piccolo.event.*;


// implements PenListener
public class CGroupEraseModeInputHandler extends CalicoAbstractInputHandler
{
	public static Logger logger = Logger.getLogger(CGroupEraseModeInputHandler.class.getName());

	public static final double CREATE_GROUP_MIN_DIST = 15.0;
	
	private long uuid = 0L;

	private CGroupInputHandler parentHandler = null;
	

	public CGroupEraseModeInputHandler(long cuid, CGroupInputHandler parent)
	{
		uuid = cuid;
		parentHandler = parent;
		this.canvas_uid =  CGroupController.groupdb.get(uuid).getCanvasUID();
//		this.setupModeIcon("mode.delete");
	}

	public void actionPressed(InputEventInfo e)
	{
		CalicoInputManager.rerouteEvent(this.canvas_uid, e);
	}

	public void actionDragged(InputEventInfo e)
	{
		CalicoInputManager.rerouteEvent(this.canvas_uid, e);		
	}
	
	public void actionScroll(InputEventInfo e)
	{
		CalicoInputManager.rerouteEvent(this.canvas_uid, e);
	}
	

	public void actionReleased(InputEventInfo e)
	{
		CalicoInputManager.rerouteEvent(this.canvas_uid, e);
		
		
		
		if(e.getButton()==InputEventInfo.BUTTON_RIGHT)
		{
			if(CGroupController.groupdb.get(uuid).containsPoint(e.getX(), e.getY()))
			{
				CGroupController.delete(uuid);
			}
			CGroupController.setCurrentUUID(0L);
		}
		
	}
}
