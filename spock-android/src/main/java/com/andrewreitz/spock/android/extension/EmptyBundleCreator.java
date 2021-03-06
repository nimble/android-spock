/*
 * Copyright (C) 2015 Andrew Reitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.andrewreitz.spock.android.extension;

import android.os.Bundle;
import com.andrewreitz.spock.android.BundleCreator;

/**
 * BundleCreator that returns an empty bundle.
 *
 * @author Andrew Reitz
 * @since 1.1
 */
public final class EmptyBundleCreator implements BundleCreator {
  private static final Bundle EMPTY_BUNDLE = new Bundle();

  @Override public Bundle createBundle() {
    return EMPTY_BUNDLE;
  }
}
