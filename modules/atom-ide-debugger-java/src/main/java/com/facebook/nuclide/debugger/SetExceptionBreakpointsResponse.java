/*
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the license found in the LICENSE file in
 * the root directory of this source tree.
 */

package com.facebook.nuclide.debugger;

import org.json.JSONObject;

public class SetExceptionBreakpointsResponse extends base$Response {

  public SetExceptionBreakpointsResponse(int request_seq) {
    super(request_seq, "setExceptionBreakpoints");
  }

  public JSONObject toJSON() {
    return super.toJSON();
  }
}
