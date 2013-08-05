/**
 * SMART - State Machine ARchiTecture
 *
 * Copyright (C) 2012 Individual contributors as indicated by
 * the @authors tag
 *
 * This file is a part of SMART.
 *
 * SMART is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SMART is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * */

/**
 * ************************************************************
 * HEADERS
 * ************************************************************
 * File:                org.anon.sampleapp.registration.RegistrationManager
 * Author:              arjun
 * Revision:            1.0
 * Date:                27-06-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A manager for registrations
 *
 * ************************************************************
 * */

package org.anon.sampleapp.registration;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RegistrationManager {

	public RegistrationManager() {
		// TODO Auto-generated constructor stub
	}

	public boolean isValidEmail(String email) {
		String pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
		Pattern p = Pattern.compile(pattern);
		Matcher match = p.matcher(email);
		if (match.matches()) {
			return true;
		}

		return false;
	}

	// add new user
	public void registerUser(RegisterEvent register) {

		RegistrationResponse resp = null;

		// check if the email is valid
		if (isValidEmail(register.getEmail())) {
			RegisterRecord reg = new RegisterRecord();
			reg.setEmail(register.getEmail());
			reg.setTenantId(register.getTenantId());
			
			UUID random = UUID.randomUUID();
			reg.setRandomCode(random.toString());
			resp = new RegistrationResponse(false, "Registered :"
					+ register.getEmail(), random);
		} else {
			resp = new RegistrationResponse(false,
					"Registration failed.Please check your Email ID");
		}
	}

	// activate user
	public void activateUser(RegisterRecord rc) {
		rc.setStatus(true);
		RegistrationResponse resp = new RegistrationResponse(true,
				"Activated user");
	}

	// activate user
	public void checkStatus(RegisterRecord rc) {
		CheckStatusResponse resp = new CheckStatusResponse(rc.isStatus());
	}

	public void sendVMail(RegisterRecord rc, MailerEvent e) {
		final String username = "asterix@smart-platform.com";
		final String password = "welcome!23";
		final String tomail = "kakashi391@gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "false");
		props.put("mail.smtp.host", "mail.smart-platform.com");
		props.put("mail.smtp.localhost", "www.smart-platform.com");
		props.put("mail.smtp.port", "587");
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(rc.getEmail()));
			message.setSubject("Verification Mail");
			message.setText("Hello,"
					+ "\n\n Welcome to Smart. Please click the link below to activate you account.\n\n"
					+ "www.demo.smart-platform.com/confirmation_page.html?c="
					+ rc.getRandomCode()

					+ "\n\n Smart Team");
			Transport.send(message);
			RegistrationResponse resp = new RegistrationResponse(false,
					"Mail sent to User");

		} catch (MessagingException err) {
			throw new RuntimeException(err);
		}
	}

}
