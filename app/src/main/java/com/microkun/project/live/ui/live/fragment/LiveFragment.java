package com.microkun.project.live.ui.live.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.microkun.project.live.databinding.FragmentLiveBinding;

/**
 * @introduction：
 * @author： 林锦焜
 * @time： 2022/9/1 20:11
 */
public class LiveFragment extends Fragment {

    public static LiveFragment newInstance() {
        return new LiveFragment();
    }

    FragmentLiveBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentLiveBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

}
