/*----------------------------------------------------------------------------*/
/* Copyright (c) 2008-2017 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.buttons;

import edu.wpi.first.wpilibj.XboxController;

/**
 * A {@link Button} that gets its state from an {@link XboxController}.
 */
public class XboxControllerButton extends Button {
  /**
   * Represents a digital button on an XboxController.
   */
  private enum Button {
    kBumperLeft,
    kBumperRight,
    kStickLeft,
    kStickRight,
    kA,
    kB,
    kX,
    kY,
    kBack,
    kStart;
  }

  private final XboxController m_controller;
  private final XboxControllerButton.Button m_button;

  /**
   * Create an Xbox Controller button for triggering commands.
   *
   * @param controller   The XboxController object that has the button
   * @param button       The button to use (see {@link XboxControllerButton.Button}
   */
  private XboxControllerButton(XboxController controller, XboxControllerButton.Button button) {
    m_controller = controller;
    m_button = button;
  }

  /**
   * Gets the value of the controller button.
   *
   * @return The value of the controller button
   */
  public boolean get() {
    switch (m_button) {
      case kBumperLeft:
        return m_controller.getBumper(XboxController.Hand.kLeft);
      case kBumperRight:
        return m_controller.getBumper(XboxController.Hand.kRight);
      case kStickLeft:
        return m_controller.getStickButton(XboxController.Hand.kLeft);
      case kStickRight:
        return m_controller.getStickButton(XboxController.Hand.kRight);
      case kA:
        return m_controller.getAButton();
      case kB:
        return m_controller.getBButton();
      case kX:
        return m_controller.getXButton();
      case kY:
        return m_controller.getYButton();
      case kBack:
        return m_controller.getBackButton();
      case kStart:
        return m_controller.getStartButton();
      default:
        return false; //shouldn't ever reach this point
    }
  }

  /**
   * Create an Xbox Controller button on the left bumper.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getBumperLeftButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kBumperLeft);
  }

  /**
   * Create an Xbox Controller button on the right bumper.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getBumperRightButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kBumperRight);
  }

  /**
   * Create an Xbox Controller button on the left stick.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getStickLeftButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kStickLeft);
  }

  /**
   * Create an Xbox Controller button on the right stick.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getStickRightButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kStickRight);
  }

  /**
   * Create an Xbox Controller button on the A button.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getAButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kA);
  }

  /**
   * Create an Xbox Controller button on the B button.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getBButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kB);
  }

  /**
   * Create an Xbox Controller button on the X button.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getXButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kX);
  }

  /**
   * Create an Xbox Controller button on the Y button.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getYButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kY);
  }

  /**
   * Create an Xbox Controller button on the Back button.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getBackButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kBack);
  }

  /**
   * Create an Xbox Controller button on the Start button.
   *
   * @param controller The XboxController object that has the button
   */
  public static XboxControllerButton getStartButton(XboxController controller) {
    return new XboxControllerButton(controller, Button.kStart);
  }
}
