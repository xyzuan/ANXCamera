.class Lcom/android/camera/module/LiveModuleSubVV$4;
.super Ljava/lang/Object;
.source "LiveModuleSubVV.java"

# interfaces
.implements Lcom/android/camera/SensorStateManager$SensorStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/camera/module/LiveModuleSubVV;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/camera/module/LiveModuleSubVV;


# direct methods
.method constructor <init>(Lcom/android/camera/module/LiveModuleSubVV;)V
    .locals 0

    iput-object p1, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isWorking()Z
    .locals 1

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-virtual {v0}, Lcom/android/camera/module/LiveModuleSubVV;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-virtual {v0}, Lcom/android/camera/module/LiveModuleSubVV;->getCameraState()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public notifyDevicePostureChanged()V
    .locals 1

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    iget-object v0, v0, Lcom/android/camera/module/LiveModuleSubVV;->mActivity:Lcom/android/camera/Camera;

    invoke-virtual {v0}, Lcom/android/camera/Camera;->getEdgeShutterView()Lcom/android/camera/ui/V9EdgeShutterView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/camera/ui/V9EdgeShutterView;->onDevicePostureChanged()V

    return-void
.end method

.method public onDeviceBecomeStable()V
    .locals 2

    invoke-static {}, Lcom/android/camera/module/LiveModuleSubVV;->access$300()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onDeviceBecomeStable"

    invoke-static {v0, v1}, Lcom/android/camera/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onDeviceBeginMoving()V
    .locals 0

    return-void
.end method

.method public onDeviceKeepMoving(D)V
    .locals 7

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    iget-object v0, v0, Lcom/android/camera/module/LiveModuleSubVV;->mMainProtocol:Lcom/android/camera/protocol/ModeProtocol$MainContentProtocol;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/android/camera/protocol/ModeProtocol$MainContentProtocol;->isEvAdjusted(Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    iget-boolean v0, v0, Lcom/android/camera/module/LiveModuleSubVV;->mPaused:Z

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-static {v0}, Lcom/android/camera/module/LiveModuleSubVV;->access$700(Lcom/android/camera/module/LiveModuleSubVV;)J

    move-result-wide v3

    const-wide/16 v5, 0xbb8

    invoke-static/range {v1 .. v6}, Lcom/android/camera/Util;->isTimeout(JJJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-virtual {v0}, Lcom/android/camera/module/LiveModuleSubVV;->is3ALocked()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-static {v0}, Lcom/android/camera/module/LiveModuleSubVV;->access$800(Lcom/android/camera/module/LiveModuleSubVV;)Lcom/android/camera/module/loader/camera2/FocusManager2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-static {v0}, Lcom/android/camera/module/LiveModuleSubVV;->access$800(Lcom/android/camera/module/LiveModuleSubVV;)Lcom/android/camera/module/loader/camera2/FocusManager2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/camera/module/loader/camera2/FocusManager2;->isNeedCancelAutoFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-virtual {v0}, Lcom/android/camera/module/LiveModuleSubVV;->isRecording()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/camera/module/LiveModuleSubVV$4;->this$0:Lcom/android/camera/module/LiveModuleSubVV;

    invoke-static {v0}, Lcom/android/camera/module/LiveModuleSubVV;->access$800(Lcom/android/camera/module/LiveModuleSubVV;)Lcom/android/camera/module/loader/camera2/FocusManager2;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/android/camera/module/loader/camera2/FocusManager2;->onDeviceKeepMoving(D)V

    :cond_0
    return-void
.end method

.method public onDeviceKeepStable()V
    .locals 0

    return-void
.end method

.method public onDeviceLieChanged(Z)V
    .locals 0

    return-void
.end method

.method public onDeviceOrientationChanged(FZ)V
    .locals 0

    return-void
.end method

.method public onDeviceRotationChanged([F)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 0

    return-void
.end method