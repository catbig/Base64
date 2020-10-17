# Base64
=====================================
* Author : Catur Adi Nugroho
* Time   : 20181102 08:56
* Content: Decode Base64 string to file
* IDE    : NetBeans

=====================================

Project Reason:
1. Normally, the operator of printer at office set the maximum data size for outgoing e-mail messages and I-fax documents.
2. If an e-mail message exceeds this data size limit, it is split up into several e-mail messages before being sent.
3. Printer will send mail the document as attachment if the file size below limit else
4. Printer will send multiple email using multi-part message in MIME format, Content-Transfer-Encoding: base64.

Main purpose:
Decode Base64 string to file
