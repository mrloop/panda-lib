/**
 *  Copyright 2011 Maximilian Hille <mh@lambdasoup.com>
 * 
 *  This file is part of panda-lib.
 *  
 *  panda-lib is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  panda-lib is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with panda-lib.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.lambdasoup.panda.model;

import java.util.Date;

public class Encoding {
	public enum Status {
		processing, success, fail
	}
	
	public String id;
	public String videoId;
	public String profileId;
	public Status status;
	public String extname;
	public Integer encodingProgress;
	public Integer height;
	public Integer width;
	public Integer fileSize;
	public Date startedEncodingAt;
	public Integer encoding_time;
	public Date createdAt;
	public Date updatedAt;
}
