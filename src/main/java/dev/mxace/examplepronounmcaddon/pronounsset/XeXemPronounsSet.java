package dev.mxace.examplepronounmcaddon.pronounsset;

import dev.mxace.pronounmc.api.PronounsSet;

public class XeXemPronounsSet extends PronounsSet {
    public final static XeXemPronounsSet instance = new XeXemPronounsSet();

    @Override
    public String getSubjectPronoun() {
        return "xe";
    }

    @Override
    public String getObjectPronoun() {
        return "xem";
    }

    @Override
    public String getPossessiveAdjective() {
        return "xyr";
    }

    @Override
    public String getPossessivePronoun() {
        return "xyrs";
    }

    @Override
    public String getReflexivePronoun() {
        return "xemself";
    }
}