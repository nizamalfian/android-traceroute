/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.synaptictools.traceroute;

public class traceroutelibJNI {
  public final static native long new_StringVector__SWIG_0();
  public final static native long new_StringVector__SWIG_1(long jarg1, StringVector jarg1_);
  public final static native long StringVector_capacity(long jarg1, StringVector jarg1_);
  public final static native void StringVector_reserve(long jarg1, StringVector jarg1_, long jarg2);
  public final static native boolean StringVector_isEmpty(long jarg1, StringVector jarg1_);
  public final static native void StringVector_clear(long jarg1, StringVector jarg1_);
  public final static native long new_StringVector__SWIG_2(int jarg1, String jarg2);
  public final static native int StringVector_doSize(long jarg1, StringVector jarg1_);
  public final static native void StringVector_doAdd__SWIG_0(long jarg1, StringVector jarg1_, String jarg2);
  public final static native void StringVector_doAdd__SWIG_1(long jarg1, StringVector jarg1_, int jarg2, String jarg3);
  public final static native String StringVector_doRemove(long jarg1, StringVector jarg1_, int jarg2);
  public final static native String StringVector_doGet(long jarg1, StringVector jarg1_, int jarg2);
  public final static native String StringVector_doSet(long jarg1, StringVector jarg1_, int jarg2, String jarg3);
  public final static native void StringVector_doRemoveRange(long jarg1, StringVector jarg1_, int jarg2, int jarg3);
  public final static native void delete_StringVector(long jarg1);
  public final static native long new_IntVector__SWIG_0();
  public final static native long new_IntVector__SWIG_1(long jarg1, IntVector jarg1_);
  public final static native long IntVector_capacity(long jarg1, IntVector jarg1_);
  public final static native void IntVector_reserve(long jarg1, IntVector jarg1_, long jarg2);
  public final static native boolean IntVector_isEmpty(long jarg1, IntVector jarg1_);
  public final static native void IntVector_clear(long jarg1, IntVector jarg1_);
  public final static native long new_IntVector__SWIG_2(int jarg1, int jarg2);
  public final static native int IntVector_doSize(long jarg1, IntVector jarg1_);
  public final static native void IntVector_doAdd__SWIG_0(long jarg1, IntVector jarg1_, int jarg2);
  public final static native void IntVector_doAdd__SWIG_1(long jarg1, IntVector jarg1_, int jarg2, int jarg3);
  public final static native int IntVector_doRemove(long jarg1, IntVector jarg1_, int jarg2);
  public final static native int IntVector_doGet(long jarg1, IntVector jarg1_, int jarg2);
  public final static native int IntVector_doSet(long jarg1, IntVector jarg1_, int jarg2, int jarg3);
  public final static native void IntVector_doRemoveRange(long jarg1, IntVector jarg1_, int jarg2, int jarg3);
  public final static native void delete_IntVector(long jarg1);
  public final static native long new_VecDouble__SWIG_0();
  public final static native long new_VecDouble__SWIG_1(long jarg1, VecDouble jarg1_);
  public final static native long VecDouble_capacity(long jarg1, VecDouble jarg1_);
  public final static native void VecDouble_reserve(long jarg1, VecDouble jarg1_, long jarg2);
  public final static native boolean VecDouble_isEmpty(long jarg1, VecDouble jarg1_);
  public final static native void VecDouble_clear(long jarg1, VecDouble jarg1_);
  public final static native long new_VecDouble__SWIG_2(int jarg1, double jarg2);
  public final static native int VecDouble_doSize(long jarg1, VecDouble jarg1_);
  public final static native void VecDouble_doAdd__SWIG_0(long jarg1, VecDouble jarg1_, double jarg2);
  public final static native void VecDouble_doAdd__SWIG_1(long jarg1, VecDouble jarg1_, int jarg2, double jarg3);
  public final static native double VecDouble_doRemove(long jarg1, VecDouble jarg1_, int jarg2);
  public final static native double VecDouble_doGet(long jarg1, VecDouble jarg1_, int jarg2);
  public final static native double VecDouble_doSet(long jarg1, VecDouble jarg1_, int jarg2, double jarg3);
  public final static native void VecDouble_doRemoveRange(long jarg1, VecDouble jarg1_, int jarg2, int jarg3);
  public final static native void delete_VecDouble(long jarg1);

  static {
    try {
	    System.loadLibrary("traceroute");
    } catch (UnsatisfiedLinkError e) {
	    System.err.println("Failed to load native library 'traceroutelib'\n" + e);
    }
  }

  public final static native long new_TracerouteNative();
  public final static native void delete_TracerouteNative(long jarg1);
  public final static native long TracerouteNative_instance();
  public final static native int TracerouteNative_execute(long jarg1, TracerouteNative jarg1_, long jarg2, StringVector jarg2_);
  public final static native void TracerouteNative_onAppendResult(long jarg1, TracerouteNative jarg1_, String jarg2);
  public final static native void TracerouteNative_onAppendResultSwigExplicitTracerouteNative(long jarg1, TracerouteNative jarg1_, String jarg2);
  public final static native void TracerouteNative_onClearResult(long jarg1, TracerouteNative jarg1_);
  public final static native void TracerouteNative_onClearResultSwigExplicitTracerouteNative(long jarg1, TracerouteNative jarg1_);
  public final static native void TracerouteNative_director_connect(TracerouteNative obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void TracerouteNative_change_ownership(TracerouteNative obj, long cptr, boolean take_or_release);

  public static void SwigDirector_TracerouteNative_onAppendResult(TracerouteNative jself, String result) {
    jself.onAppendResult(result);
  }
  public static void SwigDirector_TracerouteNative_onClearResult(TracerouteNative jself) {
    jself.onClearResult();
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}