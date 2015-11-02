import java.util.Base64

import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.dataformat.smile.{SmileFactory, SmileParser}

object Test {
  def main(args: Array[String]) {
    val content = Base64.getDecoder.decode("""OikKAPqEdmFsdWX4+oRldmVudPqIcHNfRXZlbnQx+oFpZPqEcmVmSWRuU1h6eGJaVmJUYm11TGhNbUVJalI0ZyMzaEdtZXM5RFRmaUxRcUlGRGo1ZWVnIzGDbmFtZWRSZXNvdXJjZXNTaGFyZWRJbk9uZU9yZGVySXRlbV9Qcm9kdWN0+/v7+/qEZXZlbnT6iHBzX0V2ZW50MvqMcHJvZHVjdFNwZWNJZG5TWHp4YlpWYlRibXVMaE1tRUlqUjRnIzNoR21lczlEVGZpTFFxSUZEajVlZWcjMpFwcm92aWRlZEJ5UGFydHlJZHP6h25ld1ZhbHVl+FdBZGlYVm1hSVF2LXlnSUJ2Q1I5Q2JnIzL5+/v7+/qEZXZlbnT6iHBzX0V2ZW50M/qMcHJvZHVjdFNwZWNJZG5TWHp4YlpWYlRibXVMaE1tRUlqUjRnIzNoR21lczlEVGZpTFFxSUZEajVlZWcjM4xwcm9kdWN0RmFtaWx5+oduZXdWYWx1ZUdpbnRlcm5ldPv7+/v6hGV2ZW50+ohwc19FdmVudDT6jHByb2R1Y3RTcGVjSWRuU1h6eGJaVmJUYm11TGhNbUVJalI0ZyMzaEdtZXM5RFRmaUxRcUlGRGo1ZWVnIzSKbWFpblByb2R1Y3QiinByb2R1Y3RUeXBlTUdlbmVyaWNTZXJ2aWNlk2RlZmluZWRCdXNpbmVzc01vZGVsS1N1YnNjcmlwdGlvbvv7+/qEZXZlbnT6pnBzX1Byb2R1Y3RTcGVjUmVzb3VyY2VTcGVjVXNlQWRkZWRFdmVudPqQcmVzb3VyY2VTcGVjVXNlUEv6gnVpZEpvQ0x4cEIzWkdSUYNuYW1la1Jlc291cmNlc1NoYXJlZEluT25lT3JkZXJJdGVtX3N1YnNjcmlwdGlvbklE+4xwcm9kdWN0U3BlY0lkblNYenhiWlZiVGJtdUxoTW1FSWpSNGcjM2hHbWVzOURUZmlMUXFJRkRqNWVlZyM1jXJlc291cmNlU3BlY0lkbi1rNFJEWGhkUktPQUludUJUN1VBcncjM2hHbWVzOURUZmlMUXFJRkRqNWVlZyMy+/v7+oRldmVudPq2cHNfUHJvZHVjdFNwZWNSZXNvdXJjZVNwZWNVc2VJZGVudGlmaWVyVXNlc0NoYW5nZWRFdmVudPqQcmVzb3VyY2VTcGVjVXNlSWR6U1h6eGJaVmJUYm11TGhNbUVJalI0ZyMzaEdtZXM5RFRmaUxRcUlGRGo1ZWVnI29DTHhwQjNaR1JRIzaNaWRlbnRpZmllclVzZXP4+pdzdWJzY3JpcHRpb25JZGVudGlmaWVySWRuOHhXTFNGUEdUTWFrbDFQdWU3SllQQSMzaEdtZXM5RFRmaUxRcUlGRGo1ZWVnIzP7+fv7+/qEZXZlbnT6pnBzX1Byb2R1Y3RTcGVjUmVzb3VyY2VTcGVjVXNlQWRkZWRFdmVudPqQcmVzb3VyY2VTcGVjVXNlUEv6gnVpZEpRRE1ZZ0xVS29PQYNuYW1lbFJlc291cmNlc1NoYXJlZEluT25lT3JkZXJJdGVtX3N1YnNjcmlwdGlvbklEMvuMcHJvZHVjdFNwZWNJZG5TWHp4YlpWYlRibXVMaE1tRUlqUjRnIzNoR21lczlEVGZpTFFxSUZEajVlZWcjN41yZXNvdXJjZVNwZWNJZG4tazRSRFhoZFJLT0FJbnVCVDdVQXJ3IzNoR21lczlEVGZpTFFxSUZEajVlZWcjMvv7+/qEZXZlbnT6tnBzX1Byb2R1Y3RTcGVjUmVzb3VyY2VTcGVjVXNlSWRlbnRpZmllclVzZXNDaGFuZ2VkRXZlbnT6kHJlc291cmNlU3BlY1VzZUlkelNYenhiWlZiVGJtdUxoTW1FSWpSNGcjM2hHbWVzOURUZmlMUXFJRkRqNWVlZyNRRE1ZZ0xVS29PQSM4jWlkZW50aWZpZXJVc2Vz+PqXc3Vic2NyaXB0aW9uSWRlbnRpZmllcklkbmx1b0xiLWwyUURPcWtpb1ZfN3RnY2cjM2hHbWVzOURUZmlMUXFJRkRqNWVlZyMz+/n7+/v5+w==""")

    def testCase(): Unit = {
      val smileFactory: SmileFactory = new SmileFactory()

      def runTest(): Unit = {
        val sp: SmileParser = smileFactory.createParser(content)
        while (sp.nextToken() != null) {
          sp.getCurrentToken match {
            case JsonToken.FIELD_NAME if sp.getText == "resourceSpecUsePK" =>
              sp.nextToken() match {
                case JsonToken.VALUE_STRING =>
                  sys.error("WHAT? Caught value " + sp.getText + " for resourceSpecUsePK")
                case JsonToken.START_OBJECT =>
                case other =>
                  sys.error("Unexpected token - " + other)
              }
            case _ =>
          }
        }
        sp.close()
      }

      var working = true

      val r = new Runnable {
        override def run(): Unit = {
          while(working) {
            try runTest() catch {
              case e: InterruptedException =>
              case e  =>
                println(e.getMessage + " in thread " + Thread.currentThread().getName)
                //e.printStackTrace()
                //sys.exit(1)
            }
          }
        }
      }

      val threads = 1 to 256 map {
        counter => new Thread(r)
      }

      threads.foreach(_.start())
      Thread.sleep(1000)
      working = false
      threads.foreach(_.interrupt())
      threads.foreach(_.join())
    }

    var counter = 0
    while(true) {
      println("Iteration " + counter)
      counter += 1
      testCase()
    }
  }
}
