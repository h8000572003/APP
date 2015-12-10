package com.example.Andy.myapplication.backend.jsf;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Created by Andy on 2015/12/9.
 */
public class GaeSession implements PhaseListener {
    private static final long serialVersionUID = 1L;

    @Override
    public void afterPhase(PhaseEvent arg0) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("CURRENT_TIME", System.currentTimeMillis());
    }

    @Override
    public void beforePhase(PhaseEvent arg0) {
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
