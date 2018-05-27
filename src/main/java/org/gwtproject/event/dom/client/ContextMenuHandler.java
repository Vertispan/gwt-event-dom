/*
 * Copyright 2018 The GWT Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.event.dom.client;

/**
 * Handler for {@link ContextMenuEvent} events.
 */
public interface ContextMenuHandler
  extends DomEventHandler {

  /**
   * Called when a native context menu event is fired.
   *
   * @param event the {@link ContextMenuEvent} that was fired
   */
  void onContextMenu(ContextMenuEvent event);
}
