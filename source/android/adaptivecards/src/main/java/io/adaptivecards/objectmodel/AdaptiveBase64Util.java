/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class AdaptiveBase64Util {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AdaptiveBase64Util(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AdaptiveBase64Util obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_AdaptiveBase64Util(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static CharVector Decode(String encodedBase64) {
    return new CharVector(AdaptiveCardObjectModelJNI.AdaptiveBase64Util_Decode(encodedBase64), true);
  }

  public static String Encode(CharVector decodedBase64) {
    return AdaptiveCardObjectModelJNI.AdaptiveBase64Util_Encode(CharVector.getCPtr(decodedBase64), decodedBase64);
  }

  public static String ExtractDataFromUri(String dataUri) {
    return AdaptiveCardObjectModelJNI.AdaptiveBase64Util_ExtractDataFromUri(dataUri);
  }

  public AdaptiveBase64Util() {
    this(AdaptiveCardObjectModelJNI.new_AdaptiveBase64Util(), true);
  }

}
