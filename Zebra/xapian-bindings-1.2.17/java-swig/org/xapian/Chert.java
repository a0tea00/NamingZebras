/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xapian;

public class Chert {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Chert(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Chert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static Database open(String dir) {
    return new Database(XapianJNI.Chert_open__SWIG_0(dir), true);
  }

  public static WritableDatabase open(String dir, int action, int block_size) {
    return new WritableDatabase(XapianJNI.Chert_open__SWIG_1(dir, action, block_size), true);
  }

  public static WritableDatabase open(String dir, int action) {
    return new WritableDatabase(XapianJNI.Chert_open__SWIG_2(dir, action), true);
  }

}