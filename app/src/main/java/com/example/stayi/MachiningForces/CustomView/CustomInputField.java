package com.example.stayi.MachiningForces.CustomView;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.stayi.MachiningForces.Enumerations.FieldType;
import com.example.stayi.MachiningForces.R;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class CustomInputField extends LinearLayout {

    private FieldType mGeneralTextVIewFieldType = null;
    private TextView mGeneralTextVIew = null;
    private TextView mDescription = null;
    private TextView mUnit = null;

    private void init(Context context) {
        initializeViews(context);
    }

    public CustomInputField(Context context) {
        super(context);
        init(context);
    }

    public CustomInputField(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomInputField(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomInputField(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void initializeViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.custom_view, this);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mGeneralTextVIew = this.findViewById(R.id.example_element_2);
        mGeneralTextVIew.setId(View.generateViewId());
        mDescription = this.findViewById(R.id.example_element_3);
        mUnit = this.findViewById(R.id.example_element_4);
    }

    public FieldType getMainTextViewFieldType() {
        return mGeneralTextVIewFieldType;
    }

    public int getMainTextViewId() {
        return mGeneralTextVIew.getId();
    }

    public void setValues(PrimaryValue Object) {
        mGeneralTextVIewFieldType = Object.getFieldType();
        mDescription.setText(Object.getDescription());
        mUnit.setText(Object.getUnit());
    }
}