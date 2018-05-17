package com.material.androidwysiwigeditor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.irshulx.Editor;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HTMLRenderedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HTMLRenderedFragment extends Fragment {
    private static final String SERIALIZED = "";

    String x = "<h2 id=\"installation\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;color:#c00; margin-top: -80px !important;\">Installation</h2>" +
            "<h3 id=\"requires-html5-doctype\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-bottom: 8px; margin-right: 0px; margin-left: 0px;\">Requires HTML5 doctype</h3>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">Bootstrap uses certain HTML elements and CSS properties which require HTML5 doctype. Include&nbsp;<code style=\"font-size: 12.6px;\">&lt;!DOCTYPE html&gt;</code>&nbsp;in the beginning of all your projects.</p>" +
            "<img src=\"http://www.scifibloggers.com/wp-content/uploads/TOR_2.jpg\" />" +
            "<h2 id=\"integration\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-top: -80px !important;\">Integration</h2>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">3rd parties available in django, rails, angular and so on.</p>" +
            "<h3 id=\"django\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-bottom: 8px; margin-right: 0px; margin-left: 0px;\">Django</h3>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">Handy update for your django admin page.</p>" +
            "<ul style=\"color: rgb(51, 51, 51);\"><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"https://github.com/summernote/django-summernote\" target=\"_blank\">django-summernote</a></li><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"https://pypi.python.org/pypi/django-summernote\" target=\"_blank\">summernote plugin for Django</a></li></ul>" +
            "<h3 id=\"ruby-on-rails\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-bottom: 8px; margin-right: 0px; margin-left: 0px;\">Ruby On Rails</h3>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">This gem was built to gemify the assets used in Summernote.</p>" +
            "<ul style=\"color: rgb(51, 51, 51);\"><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"https://github.com/summernote/summernote-rails\" target=\"_blank\">summernote-rails</a></li></ul>" +
            "<h3 id=\"angularjs\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-bottom: 8px; margin-right: 0px; margin-left: 0px;\">AngularJS</h3>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">AngularJS directive to Summernote.</p>" +
            "<ul style=\"color: rgb(51, 51, 51);\"><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"https://github.com/summernote/angular-summernote\">angular-summernote</a></li></ul>" +
            "<h3 id=\"apache-wicket\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-bottom: 8px; margin-right: 0px; margin-left: 0px;\">Apache Wicket</h3>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">Summernote widget for Wicket Bootstrap.</p>" +
            "<ul style=\"color: rgb(51, 51, 51);\"><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"http://wb-mgrigorov.rhcloud.com/summernote\" target=\"_blank\">demo</a></li><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"https://github.com/l0rdn1kk0n/wicket-bootstrap/tree/4f97ca783f7279ca43f9e2ee790703161f59fa40/bootstrap-extensions/src/main/java/de/agilecoders/wicket/extensions/markup/html/bootstrap/editor\" target=\"_blank\">source code</a></li></ul>" +
            "<h3 id=\"webpack\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-bottom: 8px; margin-right: 0px; margin-left: 0px;\">Webpack</h3>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">Example about using summernote with webpack.</p>" +
            "<ul style=\"color: rgb(51, 51, 51);\"><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"https://github.com/hackerwins/summernote-webpack-example\" target=\"_blank\">summernote-webpack-example</a></li></ul>" +
            "<h3 id=\"meteor\" style=\"font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; margin-bottom: 8px; margin-right: 0px; margin-left: 0px;\">Meteor</h3>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\">Example about using summernote with meteor.</p>" +
            "<ul style=\"color: rgb(51, 51, 51);\"><li style=\"font-size: 14px; color: rgb(104, 116, 127);\"><a href=\"https://github.com/hackerwins/summernote-meteor-example\" target=\"_blank\">summernote-meteor-example</a></li></ul>" +
            "<p style=\"font-size: 14px; color: rgb(104, 116, 127);\"><br></p>";

    // TODO: Rename and change types of parameters
    private String mSerialized;
    private String mSerializedHtml;

    public HTMLRenderedFragment() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param serialized Parameter 1.
     * @return A new instance of fragment PreviewFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HTMLRenderedFragment newInstance(String serialized) {
        HTMLRenderedFragment fragment = new HTMLRenderedFragment();
        Bundle args = new Bundle();
        args.putString(SERIALIZED, serialized);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mSerialized = getArguments().getString(SERIALIZED);
            Editor editor=new Editor(getContext(),null);
            mSerializedHtml= editor.getContentAsHTML(x);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_htmlrendered, container, false);
        ((TextView)view.findViewById(R.id.lblHtmlRendered)).setText(mSerializedHtml);
        return  view;
    }

}