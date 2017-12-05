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
    kBumperLeft(5),
    kBumperRight(6),
    kStickLeft(9),
    kStickRight(10),
    kA(1),
    kB(2),
    kX(3),
    kY(4),
    kBack(7),
    kStart(8);

    @SuppressWarnings("MemberName")
    private int value;

    Button(int value) {
      this.value = value;
    }
  }

  private final XboxController m_controller;
  private final int m_buttonNumber;

  /**
   * Create an Xbox Controller button for triggering commands.
   *
   * @param controller   The XboxController object that has the button
   * @param button       The button to use (see {@link XboxControllerButton.Button}
   */
  private XboxControllerButton(XboxController controller, XboxControllerButton.Button button) {
    m_controller = controller;
    m_buttonNumber = button.value;
  }

  /**
   * Gets the value of the controller button.
   *
   * @return The value of the controller button
   */
  public boolean get() {
    switch(m_buttonNumber) {
      case Button.kBumperLeft.value:
        return m_controller.getBumper(XboxController.Hand.kLeft);
      case Button.kBumperRight.value:
        return m_controller.getBumper(XboxController.Hand.kRight);
      case Button.kStickLeft.value:
        return m_controller.getStickButton(XboxController.Hand.kLeft);
      case Button.kStickRight.value:
        return m_controller.getStickButton(XboxController.Hand.kRight);
      case Button.kA.value:
        return m_controller.getAButton();
      case Button.kB.value:
        return m_controller.getBButton();
      case Button.kX.value:
        return m_controller.getXButton();
      case Button.kY.value:
        return m_controller.getYButton();
      case Button.kBack.value:
        return m_controller.getBackButton();
      case Button.kStart.value:
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
