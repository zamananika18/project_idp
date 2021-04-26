// Generated code from Butter Knife. Do not modify!
package com.example.smartvendingmachine.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.smartvendingmachine.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyDrinkAdapter$MyDrinkViewHolder_ViewBinding implements Unbinder {
  private MyDrinkAdapter.MyDrinkViewHolder target;

  @UiThread
  public MyDrinkAdapter$MyDrinkViewHolder_ViewBinding(MyDrinkAdapter.MyDrinkViewHolder target,
      View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.imageView, "field 'imageView'", ImageView.class);
    target.txtName = Utils.findRequiredViewAsType(source, R.id.txtName, "field 'txtName'", TextView.class);
    target.txtPrice = Utils.findRequiredViewAsType(source, R.id.txtPrice, "field 'txtPrice'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyDrinkAdapter.MyDrinkViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.txtName = null;
    target.txtPrice = null;
  }
}
