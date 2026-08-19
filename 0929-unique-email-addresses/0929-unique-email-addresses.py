class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        valid_emails = set()
        for email in emails:
            split = email.split("@")
            first_split = split[0].split("+")[0].replace(".", "")
            second_split = split[1]
            valid_emails.add(first_split + "@" + second_split)
        return len(valid_emails)
                        


        