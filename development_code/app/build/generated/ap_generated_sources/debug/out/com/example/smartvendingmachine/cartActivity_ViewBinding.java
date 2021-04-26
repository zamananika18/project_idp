// Generated code from Butter Knife. Do not modify!
package com.example.smartvendingmachine;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.nex3z.notificationbadge.NotificationBadge;
import java.lang.IllegalStateException;
import java.lang.Override;

public class cartActivity_ViewBinding implements Unbinder {
  private cartActivity target;

  @UiThread
  public cartActivity_ViewBinding(cartActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public cartActivity_ViewBinding(cartActivity target, View source) {
    this.target = target;

    target.recyclerDrink = Utils.findRequiredViewAsType(source, R.id.recycler_drink, "field 'recyclerDrink'", RecyclerView.class);
    target.mainLayout = Utils.findRequiredViewAsType(source, R.id.mainLayout, "field 'mainLayout'", RelativeLayout.class);
    target.badge = Utils.findRequiredViewAsType(source, R.id.badge, "field 'badge'", NotificationBadge.class);
    target.btnCart = Utils.findRequiredViewAsType(source, R.id.btnCart, "field 'btnCart'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    cartActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerDrink = null;
    target.mainLayout = null;
    target.badge = null;
    target.btnCart = null;
  }
}
