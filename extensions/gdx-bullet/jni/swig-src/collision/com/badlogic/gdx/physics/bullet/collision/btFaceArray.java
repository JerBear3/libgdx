/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btFaceArray extends BulletBase {
	private long swigCPtr;
	
	protected btFaceArray(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btFaceArray, normally you should not need this constructor it's intended for low-level usage. */ 
	public btFaceArray(long cPtr, boolean cMemoryOwn) {
		this("btFaceArray", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btFaceArray obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btFaceArray(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btFaceArray operatorAssignment(btFaceArray other) {
    return new btFaceArray(CollisionJNI.btFaceArray_operatorAssignment(swigCPtr, this, btFaceArray.getCPtr(other), other), false);
  }

  public btFaceArray() {
    this(CollisionJNI.new_btFaceArray__SWIG_0(), true);
  }

  public btFaceArray(btFaceArray otherArray) {
    this(CollisionJNI.new_btFaceArray__SWIG_1(btFaceArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return CollisionJNI.btFaceArray_size(swigCPtr, this);
  }

  public btFace at(int n) {
    return new btFace(CollisionJNI.btFaceArray_at__SWIG_0(swigCPtr, this, n), false);
  }

  public btFace operatorSubscript(int n) {
    return new btFace(CollisionJNI.btFaceArray_operatorSubscript__SWIG_0(swigCPtr, this, n), false);
  }

  public void clear() {
    CollisionJNI.btFaceArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    CollisionJNI.btFaceArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    CollisionJNI.btFaceArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, btFace fillData) {
    CollisionJNI.btFaceArray_resize__SWIG_0(swigCPtr, this, newsize, btFace.getCPtr(fillData), fillData);
  }

  public void resize(int newsize) {
    CollisionJNI.btFaceArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public btFace expandNonInitializing() {
    return new btFace(CollisionJNI.btFaceArray_expandNonInitializing(swigCPtr, this), false);
  }

  public btFace expand(btFace fillValue) {
    return new btFace(CollisionJNI.btFaceArray_expand__SWIG_0(swigCPtr, this, btFace.getCPtr(fillValue), fillValue), false);
  }

  public btFace expand() {
    return new btFace(CollisionJNI.btFaceArray_expand__SWIG_1(swigCPtr, this), false);
  }

  public void push_back(btFace _Val) {
    CollisionJNI.btFaceArray_push_back(swigCPtr, this, btFace.getCPtr(_Val), _Val);
  }

  public int capacity() {
    return CollisionJNI.btFaceArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    CollisionJNI.btFaceArray_reserve(swigCPtr, this, _Count);
  }

  static public class less extends BulletBase {
  	private long swigCPtr;
  	
  	protected less(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new less, normally you should not need this constructor it's intended for low-level usage. */ 
  	public less(long cPtr, boolean cMemoryOwn) {
  		this("less", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(less obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				CollisionJNI.delete_btFaceArray_less(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public boolean operatorFunctionCall(btFace a, btFace b) {
      return CollisionJNI.btFaceArray_less_operatorFunctionCall(swigCPtr, this, btFace.getCPtr(a), a, btFace.getCPtr(b), b);
    }
  
    public less() {
      this(CollisionJNI.new_btFaceArray_less(), true);
    }
  
  }

  public void swap(int index0, int index1) {
    CollisionJNI.btFaceArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(btFace key) {
    return CollisionJNI.btFaceArray_findBinarySearch(swigCPtr, this, btFace.getCPtr(key), key);
  }

  public int findLinearSearch(btFace key) {
    return CollisionJNI.btFaceArray_findLinearSearch(swigCPtr, this, btFace.getCPtr(key), key);
  }

  public int findLinearSearch2(btFace key) {
    return CollisionJNI.btFaceArray_findLinearSearch2(swigCPtr, this, btFace.getCPtr(key), key);
  }

  public void removeAtIndex(int index) {
    CollisionJNI.btFaceArray_removeAtIndex(swigCPtr, this, index);
  }

  public void remove(btFace key) {
    CollisionJNI.btFaceArray_remove(swigCPtr, this, btFace.getCPtr(key), key);
  }

  public void initializeFromBuffer(long buffer, int size, int capacity) {
    CollisionJNI.btFaceArray_initializeFromBuffer(swigCPtr, this, buffer, size, capacity);
  }

  public void copyFromArray(btFaceArray otherArray) {
    CollisionJNI.btFaceArray_copyFromArray(swigCPtr, this, btFaceArray.getCPtr(otherArray), otherArray);
  }

}
