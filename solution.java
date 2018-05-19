public class solution {
//ODKOMENTOWAĆ NA POTRZEBY TESTÓW
    //poniższy string zawiera odpowiedź jaką powinien podać program
//private static String correctResult="CvtYxHkhrmDHCePQSRpttkiBdXPcTrJYCvNntgBtRKBeJATNusOMXkVWfokLTLAHWlpNEHgxxiSORWCzpXGuSxKeFLdletacPsiHfQttTjnWWyFyQCikeaBkxdVeVFLmeqfZTdZdTlkuXQhCMhVpjdfYBuLECpSIjSdfFaGOUdiFuFDEafbAFDzZMbHFoebDShxgwIaWowWGyJKEiEZDWYJVeKdTRRbeodiISjqcLjlglUFVwVTCzPabYuaUBrGPSQJDLHLWkUvgQTJgqIYEWYWunIApGCrgsZzbYqhTFRmqwlRChhESkreySNdMXBytXjQqrJLXGwXJEoZPNLYkzBrWFngsBbFmzWZNQhONhzwZMIhbDxxGCzQlraIkFygGKJkMvdIJyTKAHsDsoYkpmAVbRyPsNCmwyhOLRdjuMGwMcCbRQeWWecAEIYzjRWOcZuwPCxXSEFsdZrLbFixOuMgeEOUxQPcbPgmPfpOBTxzQPxqYgSsbWLXMQaHkrAqGypvdTkUKnvvmctiHsFwyedMvyQMzZRSDGhjnXFtGZAlurFIoJBVfhXvDhHtHeIkiSLFqCDswZKEzxmURUfMEjYWilAMPKcRlBWxycqzczbduPaSsaqyjvfVXAyPFtVbHmvBOcijTGeKNfMOWCiDjMPMQlukOMDfaqJMtUpklmZonbSYrRlNMogqirtQGYRpXCaNruemxxiSnOqImDXanUPObDSPboGSLifxstHZBmoibxrzhHOWonjZBesqkaNzRJVGbdbRSrgYCBVVygnqXDThPKkHhmJkbHLjAfzlTTqEgaBxSKAQwjbOmcqaCrLkDBZFhUlNEmjXwKhqbTnEioWYSnYouQIHdpvzuCqZSISsiMsEErNKNltlTfFHNMzYHPLOTmvzhoAacYyVMeyzrTARwnmqfAMLAPaZTpaTDGhmwIeAGHLQsfWoCnohNwEWqnCFbjIhrZAaLyTpNCQGzIfrcaHdxzUTNOZQlLwpxHhGWrXovDPihJKtDUbJdtYAaQYIXrTDtofvXRbqINETgXHrbCLibSwMgzuJaYNpKIEQZfiWAbustldBmTGYOIjjlVCwAULFqAABooDmhoInHeXSDLbaBhEgQlHubuKNzayrgxlqpkhxDuihnJafQLozBfWRwGWIxUDIYQNjbzYkdHeOrAWOYTOwsMavXXrpcuewoPqsnbMXVppnsHiDblEaWklYYdgNENiMfFeaZTfAIfWeUbbSowejTsFadmguyxnZrSfOMERjKAPfKVRndivSLYdqoPKhzaXFHdjDAUtMWfHkqbEyQAlEXGaASEHdueSGQYSmQLKLFlDfefKymbagistcSfgzWIKBlkNRwSedYgRgVDlfXnsQlwbECqfGoEoZpBJEmaEJEWmebIsXWNngwnKUkJWDRBsLpLYuPlqKvQcQLKamoSywRWLiwtYscbflLmaZXnlnAyoRGYtNxGpQpCPSsMjhfboEJhBHiBqeKsxvGRpwZoRJAgiwunRQdRfWxgjzhJigSjsnBAhTUHmlHQjXbteHbvsSUmHaGsoeRpdJKTqFVZmQvqCeKBEGibrOCVIytClAnsEwmpfsIpMdYUPlNqsSloZkYDuuRbomXXDHCZIVjpyVQZbJMkWsuZqWlulrOOqLtmYbAOHfGBBQGmtGumoOFLeRHEJXkCVromOdSUvGyLtVVSFWIhglJICTiBneWyYaBxjgZqupHiSLcinMFqhHunoTJTegBvZHhbZfuZpylXnvJLSGlIHxnQZtnDVWEEhlKkHHUUSNErSGOOfIHpFkWOiZuorACGYFZFjtkbDfgFAjJzsWshDIuNqChiDiBgziHoRemYyTLOqZqzcfsbVAtNrbrtIuKOeMdlqeTTcLNPUbQISiGMtYpVkiLNUuOZwfraTycnQuTxRARirSuGBKKeXZulxMIeGPuTlfEpJHyEMPmAqPpmLSkEcTYAKdMPDfHeLUdgqzNlKKiKlJYPfECJibPjHOjpaCeJJJDpXLuUENaLShXFukVDsIdplOkXMaWTojNOcAkhxkUuXLOUEjXxbTiUnCXybxaRqhaGJQMoLLdaeccSbsOybrKkboIYaHVLVuOhosCFymXTSuNBclvYolAlpRjAZChJjhwuJLmcMCnoTPrkAbzFCukIsQfSONotwGgfyvKfsZKlhekjsxMDnGqfcfHHlvtWUaxMwdiejECGoVMkvMZsNGXFIKLNoZuqNawLvfjQWJewPQJRKrYFSwmIkiyxeedqAFsStGLFPZlgyGazpkFMDbcUGMdaDKttOHGerTYStQnKCULfMcnDWaKzarApDaIdrqVZafMQEMmEViZDeuBZQAAoPVDUeiNxgiFpdSRtiergKzUErvFHOjjjsyGbsRzoDybcnHGPtIusktpZlgIfOnILRzbnStuiDmSggTEprnUHdVDnciNnvmSAzRevYwhbewvZmzuhHxGpbKIHEOqNGoLaTUOIiUfONhlscnsZsGUPNRIFrQJHrbBlcQkYbZgDcjVKefxjZHrFmDUOFDfxohEcloFhBmNSIccJYlRmNSjVQZTHMeUosPDrkvYwKjfgXxKqFJGSMUaTuGZYIJUOZVHEpHuQXcqrRAsYDtfcWSwQfNyRaGpYzWDKFgEVwoOjszutNZIqhJPfUuRuXvUcNTsmSEeZHTgCSKSUMevplQVHqWgmzLVUtVFQKYlVrwemWpyTvSbeFveWLGChbMKSgoyUEmLszuUZHSloMzcQbfQNkFvgQdapTDGbKideYDoEMmVVVfIHoeJGZoIsDzZxVGmGYxvCTFkhxjjQsUblvmKitJyNfkAFPCgaOfCNLIjWcVvdOujAXsQJwyzaNyDcDwnjMcIAEiORZcoukwQrjrEKWOfHEoxAztYJcTprpzdOwxflKXTkzJhAuMRwfQtAhzYMYvMLDCttrAYMDdxJCcYCRchVwJaDjFlhMgfVWIzXRaKyrVSGAKgxoEgTXIZDQyxpFVjJqoNcUISEpwtHugsFcuyboplXbLZtRDRpQLMdTzrSYoYwfXcdGnUYcftdcIYngFiqrhEfMmImGCtpuTrfjklqoOBnbEHBAhYphiMcZeIIdNMutMIkgiopyYdildzMNQtjVZLAWWfBEmmTjNEmpNgRAmvkayIAAYrujftSYpWgOqrrpTXWCmVJZRtmCaQomcuSjNTXrWifKkCZAjQtLFKShdiIaLUwNYHCIuAeuhFdjwjzsiVZCzkygkGYSnOmmdHkDDPvaMHCUTtTScezRShcWQiHYOXJpiNWOxGWlFHXBIlPIoLgbznwnoRISKpwRtxlTcSLysDpPFYJFcWIuarOxxQuxHVFdjpcCyWNGRAMzkYjgjftqbAnhoNKNMFhUfhXzHZCSsUuGrICXCAcPzSEkaPPZjAoXzGGrcBEsqniiXdFaIWdfpJMBqTYFEYZzGnLbJUqTXiVdDlLoAAZXAlKKYDAerPrBmpPlHqqfXHrxLWNPhIuGDTEwdwCFbJGkzMMgJuPgcgIngRDEnABOUTAwmLuXCaIAYkSbSgXeIbgttcEejtKcjgUVexICXGEJjrEGNVUfdyAjceYbjIRJgjDwRArCbEeymASsSeXzdiNjWKImbZXgcRstngrLBrYvTZRCcsFlwmzjmMjXYsvVARHIkMykqlDZilLhlZfkNnnxtDHpqsyodHfDwwIUSWqfBWxltMzdHokVAcThBaSKwpFSMBuNRXReWxYXEkKwqEtyJXDxXOAoqpnUYRiXNGXhpAOXFIbLGmloALjgeMVlpWPjseBnjbTVvcUHNFvizzahMYumcAeSmiegPDMCcFuAPfKmyJtGJUZfhlHLjUTlDYRaRrLYgDfQfKsVjatZQSvVDccgVkhDpsDXrrUQGIFFctsqjfvHsAqrFvNVcmvwDZzfEDqhvhoqKyEQbjFAdymJgEvRevHgRTTAdFHXdLNUhCXGTsfOObwSHxPyYTLhfCsibUUQRVbHhVBnUZsoiZVccMOVWowsBdDHfxVcjpXVHFOJsJoPwqoPVoChXdHFJdZNnOzXMRDIffNvItZTUqXLMGVfMFBRtbpYgVlgLSoSVlBgxnrZKWYwbEOerYRjkGEPrCFbwrxBARUHsADkUmSqVfmZtBKPwSlUSebnLDHgoSdULDLLiLGJOXBmyQbMAhMgEsCJjSeNidDevuFCZlVLWqUdyEruOrVPDQeRyQAHjBauQWQAWopeLNHigOoLxKRaQTBfPZNWMgdKMrkYvsvbrVDVKZRnEoLkuoOvNRnBiJKSEMiUPLFIJMdbDSRSTgPreVfqlscMxHwnzQrlDTwfDtavbvjOsDjaxHQvZhiRxYcYbtLuAmnELcfflrpFAYgFtpGZxIrOpBkkQKLTBHQGwlouhrIyWbXQBfEVQCSuKYnokOPWzyoDxGjDisqUJELEnFMTHRWZsjfOyIUnMOgmbEWIUKDVvijdmmODvbNvMzDJspTulBhXgJYBJxBBrYLUMCSiqsALfnaavHgoLuLSqqxguZrthQJhSIXanxzZnJODQbhfAdPymiQIbDFPPnRrLcbDVYiNQjlfTUbxytStbVCTzzjNsJvaXvCEdEvDxOHLAnBLbkyyADRzHaxJbVMQjsJzqQCCkTxdupvorYAcQNgvBkZqTSyJmJbZjYVsvblxYdscVxckzyuKmMIiqwnePhHvOHSuDlEnGGeIgEGdDdXBpDoCCNIBFKmWfeZPqerpXtQTpJVWPeoCezBrCIGHxOKQgXnQpivJcjSxTOEoxofDMyKwTRWUGqoznWtpBrEhMsUXnGPglceTyEawSwuYmpBNQohuEzHUqoFyJyqYZvTlXvPwUXEKwzzEUIrdKuRWUzldTLPFYYfuWNCIlGkJsRLbshfEBsrydGqvIqqQzFHLsUpMgsPBwFCKXYNAZLMyTfITtKvnCOWFvDvDhehwVxOmfNTeSnZDOBIgJxXWweKerQHmKOEHkBrHaFRzlNJaELKTuIevRpdVlzbMILxYbMFnZiZfpnrrRnxwvlkbyKwoOtBxHPuBNTqijwrotiHzISERLTLUMGHwanawqUPbcuIEsLDlxZRDaqCepDjyOYpVIBMFcmodZaxlBlilMsbOJCGshBhCKRlDADImmhGhmtGJKRsZsHEzDaOOwcEvtDKBaIuDuBfXJFgujWGsLmzYGhlCmpHZnMipeFKtZWuCPGQoJYIYbWRzQHmegqrHNRPFmfyvXVnwsNxBASEAQZttlWwUrxVNVnkUleCXBtrHhHUhkjtiaXOUhxcKvAspXHbRcrCMDnbkrjXbAeLmWMYXZnpiYBppVTbVRkRBWPsDocvoriaxxxmyimOJRGLietHSVafhPOGGpcJKvrDlEtpVBqyhUTMhCfgsLzaAswAINtTCuyOLEhXnkJUGBptuTiEJBmUwcakmOzmaLFHEiZJjdYbIaztohvmVNHzpqaKyVIjJCTpMShpBVPtsvmkQEhHHOfIBOckWkNsqNmEeFZrYCdzFEpkWYDdKsrUilhwyCLOSsSxIMTshoQeyqNKZRHdaOlJhOUKszpZieeFGFMHlgytnvXPytcVKeDTFBTrgHZvXBWGuRNGnnsIzoFoFBxwvckGBiGsAdGnoDjONqVGZBqIARclJaBhcXhvcYjiTXaoVUlVmHrHtNBVIpPFjZwLiKbmAGqMRPngeEMXlfZtpPmSCJdGshsQbOBbfnmcHiZuhHCxyuBoeeVIoASMiyroQlLXauejIGwxtkQLULGTEynRwFvhQqdDQuiAsXhNYGspdfxDewRmgGSIjGBMGrEsUufMGODJtVRNcsbSDdticZBQIBhZxZuMCKDmcMeNEweICJvPyOXcuBGyJRDBSmkwIwDlualJRwLDvpEUiqmfNWdzQLyiaSdCfsTrJHrrRwwETXtEaTKFyTQokszKMnSbQhfoDryYMDHtsVdUuxbXILySfhtrteUbnxWOcnOsrBParoUzJBhfVvTZjGaAstNhKcGPklQgJHCkTfucWRygrWlDTZUPNDgGAZOBwiJvtwShpPTDUTPvutWMLPyOnuYPIbNjovzfloQbBwjRhXoRnglvuglCYVWdVTkFyYnKOvksqafaGkyRGbdeBKxJvCsOOtxCkGiUEDOsNpvxMcPCbCIfwvjiNbyXcOoHXwpZZqqzlGQaMviQeXGZtgTBylkQhxEnARPfUgTpMvyuixkdyPGHKaXWlLrUWvjRzZAulYvSuqZHIZVAzHAYxbAsyAsarITwBDxfAPoavZiNRzOpvjHvbuhIxlWqNURfIXAMongDkMwgMCpyuiEyZJIlNQKBflEUURvCLURwvwjjoPLJoOUHJwyJZmJDYzsWXJXdpgRMPBWmJVvJnPnavuJGRDUVVhxyytltnCqFuAWGOaYoDdSwvZtQRiOnyFaOCxxSbrYuILSMfSExqCNbNSSvsytPYvYEHrbLMNRCmMZpDwQKIxtBaZtMLvIdtXEXWyXfNUdxorzSaYFTdNJHkmQNcONJcwimxcTUpeOlptpeIrlXYTaCUNJIiQwVDmfyHBVURUDnVphcxAGGgcjATziJILkImoMVKlijlBRYTkewYfNQMalCeECIkMPCNayQLBWSFgMrqcdxACnNVuwoYimVTQAhvqDKIqOeVhSjszckJgIgVfalRuAHvWBOYFSKrcjDjKtPgnSNOjIiWaXeMBXfpEqnQoTAeWVxmzcdbbbPQPYOvUsXeHyfCuxmhYCNoaEgAbxNeUtJFAPBuNmbIbvJGAfbTbdTJYsxUkZrrZcgHkJPAlzoZRmMSXyHqlpcJQHccImdjhnQQfCzzTketxbYjeiInfAnbtymHcKyQjPuTjiMsXSBmnDJqCTBTOmZzhToMMIooiISfWYUowJzucKYTrbJmZyBDUYaSeLnabxsXnkNBRTOtfcPViNfhvpVVBDJBMNKWthHRQNenmYLBzTLLwYeRKxZlhJheeSZgfWqQhDnPTxoRMsRzJiIZZoAxDfxXwtIRBaBsJvkwfwOqMPOhuTwHEYTNSOHsvubYYRzGynWibwQeADKcHoLPGdfDLnWbEQvSVOxLjVMXDvzDbnuAVoFkZlyanQjDkQXWjWTIkmhGZEaRznwxQrzZQYlQGozQrVrTZjjLGMCWqdepfBdRvOIafBJwXZwrPVJipgdzGdRlhkmTKTYKLsIJWLHJFJvagcXRZepMAFqVhISzzqqeMgjlsvkteVqJyDMTiaqBmqqwqKKLsOXGzAuyTQbzSvHBqgKsgttzimQPVcIHeZbFRUNIjZOdFZaLTxFOIATCcAVqsggfeRESLiaqDfMYnPFkLlYxUhluiImvPJSZtBJcgEzoqjcrZNDhNUGUZpIJPhkpAxkvcDJXaiZUaosNApqfEkHTnJbLnPXoyWlrAWeZmCIHWHahOkJxQrlZQymtQlWhYXDNcVNcROdRRuCriHwRjYtAMGZNrILDqTJVdibpSKKRBIFQNEbBmzNuvaEIAygPzxOezeFWyjqZawCguaUUgkrjhQvHTFCZBkZYQSEpBYKroETnyMwXfciPsvJoMkflwyGWmGoHtdfRRIiGRJmfFPImYUIFCkv";

    private static String decypher(char[][] matrix) {
        String result = "";
        int limiter = 0;
        int size = matrix.length;
        double endLoopCondition = Math.ceil(matrix.length / 2.0);

        while (limiter < endLoopCondition) {
            for (int j = size - 1; j >= limiter; j--) {
                result += matrix[size - 1][j];
            }
            for (int i = size - 2; i >= limiter; i--) {
                result += matrix[i][limiter];
            }
            for (int j = limiter + 1; j < size; j++) {
                result += matrix[limiter][j];
            }
            for (int i = limiter + 1; i < size - 1; i++) {
                result += matrix[i][size - 1];
            }
            size--;
            limiter++;
        }

        return result;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.print("Error: no arguments - the program accepts one string");
            return;
        } else if (args.length > 1) {
            System.out.print("Error: to many arguments - the program accepts only one string");
            return;
        }
        int size = (int) Math.sqrt(args[0].length());
        char[][] matrix = new char[size][size];
        int charPosition = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = args[0].charAt(charPosition);
                charPosition++;
            }
        }

        //Wyświetlanie macierzy
        /*for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print('\n');
        }*/

        String result = decypher(matrix);

        //ODKOMENTOWAĆ NA POTRZEBY TESTÓW
        //if(result.compareTo(correctResult)==0){
        //    System.out.println("WELL DONE!");
        //}

        System.out.printf(result);
    }
}