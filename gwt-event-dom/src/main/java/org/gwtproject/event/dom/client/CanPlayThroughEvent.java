/*
 * Copyright © 2019 The GWT Authors
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
package org.gwtproject.event.dom.client;

import org.gwtproject.dom.client.BrowserEvents;

/**
 * Represents a native media can play through event.
 *
 * <p><span style="color:red">Experimental API: This API is still under development and is subject
 * to change. </span>
 */
public class CanPlayThroughEvent extends DomEvent<CanPlayThroughHandler> {

  /**
   * Event type for media can play through events. Represents the meta-data associated with this
   * event.
   */
  private static final Type<CanPlayThroughHandler> TYPE =
      new Type<>(BrowserEvents.CANPLAYTHROUGH, new CanPlayThroughEvent());

  /**
   * Protected constructor, use {@link
   * DomEvent#fireNativeEvent(org.gwtproject.dom.client.NativeEvent,
   * org.gwtproject.event.shared.HasHandlers)} to fire media can play through events.
   */
  protected CanPlayThroughEvent() {}

  /**
   * Gets the event type associated with media can play through events.
   *
   * @return the handler type
   */
  public static Type<CanPlayThroughHandler> getType() {
    return TYPE;
  }

  @Override
  public final Type<CanPlayThroughHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(CanPlayThroughHandler handler) {
    handler.onCanPlayThrough(this);
  }
}
