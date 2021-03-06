package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

public class ChainHead {
    private boolean mDefined;
    protected ConstraintWidget mFirst;
    protected ConstraintWidget mFirstMatchConstraintWidget;
    protected ConstraintWidget mFirstVisibleWidget;
    protected boolean mHasComplexMatchWeights;
    protected boolean mHasDefinedWeights;
    protected boolean mHasUndefinedWeights;
    protected ConstraintWidget mHead;
    private boolean mIsRtl = false;
    protected ConstraintWidget mLast;
    protected ConstraintWidget mLastMatchConstraintWidget;
    protected ConstraintWidget mLastVisibleWidget;
    private int mOrientation;
    protected float mTotalWeight = 0.0f;
    protected ArrayList<ConstraintWidget> mWeightedMatchConstraintsWidgets;
    protected int mWidgetsCount;
    protected int mWidgetsMatchCount;

    public ChainHead(ConstraintWidget constraintWidget, int i, boolean z) {
        this.mFirst = constraintWidget;
        this.mOrientation = i;
        this.mIsRtl = z;
    }

    private void defineChainProperties() {
        boolean z;
        ConstraintWidget constraintWidget;
        int i = this.mOrientation * 2;
        ConstraintWidget constraintWidget2 = this.mFirst;
        ConstraintWidget constraintWidget3 = this.mFirst;
        ConstraintWidget constraintWidget4 = this.mFirst;
        boolean z2 = false;
        while (true) {
            z = true;
            if (z2) {
                break;
            }
            this.mWidgetsCount++;
            constraintWidget3.mNextChainWidget[this.mOrientation] = null;
            constraintWidget3.mListNextMatchConstraintsWidget[this.mOrientation] = null;
            if (constraintWidget3.getVisibility() != 8) {
                if (this.mFirstVisibleWidget == null) {
                    this.mFirstVisibleWidget = constraintWidget3;
                }
                this.mLastVisibleWidget = constraintWidget3;
                if (constraintWidget3.mListDimensionBehaviors[this.mOrientation] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget3.mResolvedMatchConstraintDefault[this.mOrientation] == 0 || constraintWidget3.mResolvedMatchConstraintDefault[this.mOrientation] == 3 || constraintWidget3.mResolvedMatchConstraintDefault[this.mOrientation] == 2)) {
                    this.mWidgetsMatchCount++;
                    float f2 = constraintWidget3.mWeight[this.mOrientation];
                    if (f2 > 0.0f) {
                        this.mTotalWeight += constraintWidget3.mWeight[this.mOrientation];
                    }
                    if (isMatchConstraintEqualityCandidate(constraintWidget3, this.mOrientation)) {
                        if (f2 < 0.0f) {
                            this.mHasUndefinedWeights = true;
                        } else {
                            this.mHasDefinedWeights = true;
                        }
                        if (this.mWeightedMatchConstraintsWidgets == null) {
                            this.mWeightedMatchConstraintsWidgets = new ArrayList<>();
                        }
                        this.mWeightedMatchConstraintsWidgets.add(constraintWidget3);
                    }
                    if (this.mFirstMatchConstraintWidget == null) {
                        this.mFirstMatchConstraintWidget = constraintWidget3;
                    }
                    ConstraintWidget constraintWidget5 = this.mLastMatchConstraintWidget;
                    if (constraintWidget5 != null) {
                        constraintWidget5.mListNextMatchConstraintsWidget[this.mOrientation] = constraintWidget3;
                    }
                    this.mLastMatchConstraintWidget = constraintWidget3;
                }
            }
            if (constraintWidget2 != constraintWidget3) {
                constraintWidget2.mNextChainWidget[this.mOrientation] = constraintWidget3;
            }
            constraintWidget2 = constraintWidget3;
            ConstraintAnchor constraintAnchor = constraintWidget3.mListAnchors[i + 1].mTarget;
            if (constraintAnchor != null) {
                constraintWidget = constraintAnchor.mOwner;
                if (constraintWidget.mListAnchors[i].mTarget == null || constraintWidget.mListAnchors[i].mTarget.mOwner != constraintWidget3) {
                    constraintWidget = null;
                }
            } else {
                constraintWidget = null;
            }
            if (constraintWidget != null) {
                constraintWidget3 = constraintWidget;
            } else {
                z2 = true;
            }
        }
        this.mLast = constraintWidget3;
        if (this.mOrientation != 0 || !this.mIsRtl) {
            this.mHead = this.mFirst;
        } else {
            this.mHead = constraintWidget3;
        }
        if (!this.mHasDefinedWeights || !this.mHasUndefinedWeights) {
            z = false;
        }
        this.mHasComplexMatchWeights = z;
    }

    private static boolean isMatchConstraintEqualityCandidate(ConstraintWidget constraintWidget, int i) {
        return constraintWidget.getVisibility() != 8 && constraintWidget.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.mResolvedMatchConstraintDefault[i] == 0 || constraintWidget.mResolvedMatchConstraintDefault[i] == 3);
    }

    public void define() {
        if (!this.mDefined) {
            defineChainProperties();
        }
        this.mDefined = true;
    }

    public ConstraintWidget getFirst() {
        return this.mFirst;
    }

    public ConstraintWidget getFirstMatchConstraintWidget() {
        return this.mFirstMatchConstraintWidget;
    }

    public ConstraintWidget getFirstVisibleWidget() {
        return this.mFirstVisibleWidget;
    }

    public ConstraintWidget getHead() {
        return this.mHead;
    }

    public ConstraintWidget getLast() {
        return this.mLast;
    }

    public ConstraintWidget getLastMatchConstraintWidget() {
        return this.mLastMatchConstraintWidget;
    }

    public ConstraintWidget getLastVisibleWidget() {
        return this.mLastVisibleWidget;
    }

    public float getTotalWeight() {
        return this.mTotalWeight;
    }
}
