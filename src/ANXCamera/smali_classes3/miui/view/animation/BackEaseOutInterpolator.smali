.class public Lmiui/view/animation/BackEaseOutInterpolator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# instance fields
.field private final Qg:F


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lmiui/view/animation/BackEaseOutInterpolator;-><init>(F)V

    return-void
.end method

.method public constructor <init>(F)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lmiui/view/animation/BackEaseOutInterpolator;->Qg:F

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .registers 6

    iget v0, p0, Lmiui/view/animation/BackEaseOutInterpolator;->Qg:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_b

    const v0, 0x3fd9cd60

    goto :goto_d

    :cond_b
    iget v0, p0, Lmiui/view/animation/BackEaseOutInterpolator;->Qg:F

    :goto_d
    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr p1, v1

    mul-float v2, p1, p1

    add-float v3, v0, v1

    mul-float/2addr v3, p1

    add-float/2addr v3, v0

    mul-float/2addr v2, v3

    add-float/2addr v2, v1

    return v2
.end method
